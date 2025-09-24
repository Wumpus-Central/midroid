package com.discord.chat.presentation.list.item

import android.view.View

public data class PortalViewChatListItem(id: String, view: View, measuredDimensions: Pair<Int, Int>? = null) : ChatListItem(var1) {
   public open val id: String
   public final val view: View
   public final val measuredDimensions: Pair<Int, Int>?

   init {
      this.id = var1;
      this.view = var2;
      this.measuredDimensions = var3;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): View {
      return this.view;
   }

   public operator fun component3(): Pair<Int, Int>? {
      return this.measuredDimensions;
   }

   public fun copy(id: String = var0.id, view: View = var0.view, measuredDimensions: Pair<Int, Int>? = var0.measuredDimensions): PortalViewChatListItem {
      return new PortalViewChatListItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PortalViewChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.view == var1.view)) {
            return false;
         } else {
            return this.measuredDimensions == var1.measuredDimensions;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.id.hashCode();
      val var2: Int = this.view.hashCode();
      val var1: Int;
      if (this.measuredDimensions == null) {
         var1 = 0;
      } else {
         var1 = this.measuredDimensions.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.id;
      val var3: View = this.view;
      val var1: Pair = this.measuredDimensions;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PortalViewChatListItem(id=");
      var4.append(var2);
      var4.append(", view=");
      var4.append(var3);
      var4.append(", measuredDimensions=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
