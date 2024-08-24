package com.discord.chat.presentation.list.item

import android.view.View
import kotlin.jvm.internal.r

public data class PortalViewChatListItem(id: String, view: View, measuredDimensions: Pair<Int, Int>? = null) : ChatListItem {
   public open val id: String
   public final val measuredDimensions: Pair<Int, Int>?
   public final val view: View

   init {
      r.h(var1, "id");
      r.h(var2, "view");
      super(var1, null);
      this.id = var1;
      this.view = var2;
      this.measuredDimensions = var3;
   }

   public operator fun component1(): String {
      return this.getId();
   }

   public operator fun component2(): View {
      return this.view;
   }

   public operator fun component3(): Pair<Int, Int>? {
      return this.measuredDimensions;
   }

   public fun copy(id: String = var0.getId(), view: View = var0.view, measuredDimensions: Pair<Int, Int>? = var0.measuredDimensions): PortalViewChatListItem {
      r.h(var1, "id");
      r.h(var2, "view");
      return new PortalViewChatListItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PortalViewChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else if (!r.c(this.view, var1.view)) {
            return false;
         } else {
            return r.c(this.measuredDimensions, var1.measuredDimensions);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.getId().hashCode();
      val var3: Int = this.view.hashCode();
      val var1: Int;
      if (this.measuredDimensions == null) {
         var1 = 0;
      } else {
         var1 = this.measuredDimensions.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.getId();
      val var1: View = this.view;
      val var3: Pair = this.measuredDimensions;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PortalViewChatListItem(id=");
      var2.append(var4);
      var2.append(", view=");
      var2.append(var1);
      var2.append(", measuredDimensions=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
