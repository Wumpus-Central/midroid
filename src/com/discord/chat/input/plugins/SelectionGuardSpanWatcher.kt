package com.discord.chat.input.plugins

import android.text.Selection
import android.text.SpanWatcher
import android.text.Spannable
import com.discord.chat.input.spans.DCDNoSelectionSpan
import kotlin.jvm.internal.q

public class SelectionGuardSpanWatcher : SpanWatcher {
   private fun checkSelections(text: Spannable, selectionStart: Int?, selectionEnd: Int?) {
      if (var2 != null || var3 != null) {
         var var4: Int;
         if (var2 != null) {
            var4 = var2;
         } else if (var3 != null) {
            var4 = var3;
         } else {
            var4 = 0;
         }

         var var5: Int;
         if (var3 != null) {
            var5 = var3;
         } else if (var2 != null) {
            var5 = var2;
         } else {
            var5 = 0;
         }

         val var13: Array<Any> = var1.getSpans(var4, var5, DCDNoSelectionSpan.class);
         q.g(var13, "getSpans(start, end, T::class.java)");
         val var22: Array<DCDNoSelectionSpan> = var13 as Array<DCDNoSelectionSpan>;
         if ((var13 as Array<DCDNoSelectionSpan>).length != 0) {
            if (var2 != null) {
               var4 = var2;
            } else if (var3 != null) {
               var4 = var3;
            } else {
               var4 = 0;
            }

            val var12: Int = var22.length;
            var var7: Int = 0;
            var var6: Boolean = false;
            var5 = var4;

            while (var7 < var12) {
               val var10: Int = var1.getSpanEnd(var22[var7]);
               val var11: Int = var1.getSpanStart(var22[var7]);
               var var8: Int = var5;
               var var16: Int = var6;
               if (var5 > var11) {
                  var8 = var5;
                  var16 = var6;
                  if (var5 < var10) {
                     var16 = var10;
                     if (var10 - var5 > var5 - var11) {
                        var16 = var11;
                     }

                     var8 = var16;
                     var16 = 1;
                  }
               }

               var7++;
               var5 = var8;
               var6 = (boolean)var16;
            }

            val var18: Boolean;
            if (var2 != null && var2 != var5) {
               var18 = true;
            } else {
               var18 = false;
            }

            var var21: Boolean = false;
            if (var3 != null) {
               var21 = false;
               if (var3 != var5) {
                  var21 = true;
               }
            }

            if (var6 && (var21 || var18)) {
               Selection.setSelection(var1, var5);
            }
         }
      }
   }

   public open fun onSpanAdded(text: Spannable?, what: Any?, start: Int, end: Int) {
      if (var1 != null) {
         if (var2 is DCDNoSelectionSpan) {
            this.checkSelections(var1, var1.getSpanStart(Selection.SELECTION_START), var1.getSpanEnd(Selection.SELECTION_END));
         }
      }
   }

   public open fun onSpanChanged(text: Spannable?, what: Any?, ostart: Int, oend: Int, nstart: Int, nend: Int) {
      if (var1 != null) {
         if (q.c(var2, Selection.SELECTION_START)) {
            this.checkSelections(var1, var5, null);
         } else if (q.c(var2, Selection.SELECTION_END)) {
            this.checkSelections(var1, null, var5);
         }
      }
   }

   public open fun onSpanRemoved(text: Spannable?, what: Any?, start: Int, end: Int) {
   }
}
