package com.discord.chat.input.plugins

import android.text.Editable
import android.text.Spanned
import android.text.TextWatcher
import com.discord.chat.input.spans.DCDDeleteOnBackspaceSpan

internal class DeleteNodeOnBackspaceTextWatcher : TextWatcher {
   public final var deleteEvent: com.discord.chat.input.plugins.DeleteNodeOnBackspaceTextWatcher.DeleteEvent?
      internal set

   public final var ignoreUpdate: Boolean
      internal set

   public open fun afterTextChanged(editable: Editable?) {
      if (!this.ignoreUpdate && var1 != null) {
         val var2: DeleteNodeOnBackspaceTextWatcher.DeleteEvent = this.deleteEvent;
         if (this.deleteEvent != null) {
            this.ignoreUpdate = true;
            var1.delete(var2.getStart(), var2.getEnd());
            this.deleteEvent = null;
            this.ignoreUpdate = false;
         }
      }
   }

   public open fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
      val var8: Boolean = var1 is Spanned;
      var var12: Int = null;
      val var10: Spanned;
      if (var8) {
         var10 = var1 as Spanned;
      } else {
         var10 = null;
      }

      if (!this.ignoreUpdate && var10 != null) {
         var var5: Boolean;
         if (var3 - var4 > 0) {
            var5 = 1;
         } else {
            var5 = 0;
         }

         if (var5) {
            var4 = var4 + var2;
            var5 = var2 + var3;
            val var9: Array<Any> = var10.getSpans(var4, var2 + var3, DCDDeleteOnBackspaceSpan.class);
            var var14: Any = var9;
            if (var9 == null) {
               var14 = new DCDDeleteOnBackspaceSpan[0];
            }

            val var13: Array<DCDDeleteOnBackspaceSpan> = var14 as Array<DCDDeleteOnBackspaceSpan>;
            var3 = (var14 as Array<DCDDeleteOnBackspaceSpan>).length;
            var2 = 0;
            var var11: Int = null;

            while (var2 < var3) {
               val var7: Int = var10.getSpanStart(var13[var2]);
               val var6: Int = var10.getSpanEnd(var13[var2]);
               if (var12 == null) {
                  var14 = var7;
               } else {
                  var14 = var12;
                  if (var12 > var7) {
                     var14 = var7;
                  }
               }

               var var21: Int;
               if (var11 == null) {
                  var21 = var6;
               } else {
                  var21 = var11;
                  if (var11 < var6) {
                     var21 = var6;
                  }
               }

               var2++;
               var12 = (Integer)var14;
               var11 = var21;
            }

            if (var12 != null && var11 != null) {
               this.deleteEvent = new DeleteNodeOnBackspaceTextWatcher.DeleteEvent(Math.min(var12, var4), Math.max(var11, var5) - (var5 - var4));
            }
         }
      }
   }

   public open fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
   }

   public data class DeleteEvent(start: Int, end: Int) {
      public final val end: Int
      public final val start: Int

      init {
         this.start = var1;
         this.end = var2;
      }

      public operator fun component1(): Int {
         return this.start;
      }

      public operator fun component2(): Int {
         return this.end;
      }

      public fun copy(start: Int = var0.start, end: Int = var0.end): com.discord.chat.input.plugins.DeleteNodeOnBackspaceTextWatcher.DeleteEvent {
         return new DeleteNodeOnBackspaceTextWatcher.DeleteEvent(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DeleteNodeOnBackspaceTextWatcher.DeleteEvent) {
            return false;
         } else {
            var1 = var1;
            if (this.start != var1.start) {
               return false;
            } else {
               return this.end == var1.end;
            }
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.start) * 31 + Integer.hashCode(this.end);
      }

      public override fun toString(): String {
         val var1: Int = this.start;
         val var2: Int = this.end;
         val var3: StringBuilder = new StringBuilder();
         var3.append("DeleteEvent(start=");
         var3.append(var1);
         var3.append(", end=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
