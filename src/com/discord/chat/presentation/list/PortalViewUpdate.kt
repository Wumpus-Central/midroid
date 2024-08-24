package com.discord.chat.presentation.list

import com.discord.chat.presentation.list.item.PortalViewChatListItem
import kotlin.jvm.internal.r

public data class PortalViewUpdate(portalChatListItem: PortalViewChatListItem?, updateId: Int) : ChannelChatListAdapterUpdate(
      var2, <unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE
   ) {
   public final val portalChatListItem: PortalViewChatListItem?
   public open val updateId: Int

   init {
      this.portalChatListItem = var1;
      this.updateId = var2;
   }

   public operator fun component1(): PortalViewChatListItem? {
      return this.portalChatListItem;
   }

   public operator fun component2(): Int {
      return this.getUpdateId();
   }

   public fun copy(portalChatListItem: PortalViewChatListItem? = var0.portalChatListItem, updateId: Int = var0.getUpdateId()): PortalViewUpdate {
      return new PortalViewUpdate(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PortalViewUpdate) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.portalChatListItem, var1.portalChatListItem)) {
            return false;
         } else {
            return this.getUpdateId() == var1.getUpdateId();
         }
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.portalChatListItem == null) {
         var1 = 0;
      } else {
         var1 = this.portalChatListItem.hashCode();
      }

      return var1 * 31 + Integer.hashCode(this.getUpdateId());
   }

   public override fun toString(): String {
      val var3: PortalViewChatListItem = this.portalChatListItem;
      val var1: Int = this.getUpdateId();
      val var2: StringBuilder = new StringBuilder();
      var2.append("PortalViewUpdate(portalChatListItem=");
      var2.append(var3);
      var2.append(", updateId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
