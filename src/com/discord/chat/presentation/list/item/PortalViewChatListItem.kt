package com.discord.chat.presentation.list.item

import android.view.View
import kotlin.jvm.internal.q

public data class PortalViewChatListItem(id: String, view: View, measuredDimensions: Pair<Int, Int>? = null) : ChatListItem {
   public open val id: String
   public final val measuredDimensions: Pair<Int, Int>?
   public final val view: View

   init {
      q.h(var1, "id");
      q.h(var2, "view");
      super(var1, null);
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
      q.h(var1, "id");
      q.h(var2, "view");
      return new PortalViewChatListItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PortalViewChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.view, var1.view)) {
            return false;
         } else {
            return q.c(this.measuredDimensions, var1.measuredDimensions);
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
      val var3: java.lang.String = this.id;
      val var2: View = this.view;
      val var4: Pair = this.measuredDimensions;
      val var1: StringBuilder = new StringBuilder();
      var1.append("PortalViewChatListItem(id=");
      var1.append(var3);
      var1.append(", view=");
      var1.append(var2);
      var1.append(", measuredDimensions=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }
}
