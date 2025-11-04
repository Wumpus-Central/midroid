package com.discord.chat.listmanager

import com.discord.chat.presentation.list.item.ChatListItem

public data class ChatListUpdate(items: List<ChatListItem>,
   action: ChatListAction,
   listOperations: List<ListOperation>?,
   changesetUpdateId: Int,
   forceReload: Boolean? = null
) {
   public final val items: List<ChatListItem>
   public final val action: ChatListAction
   public final val listOperations: List<ListOperation>?
   public final val changesetUpdateId: Int
   public final val forceReload: Boolean?

   init {
      this.items = var1;
      this.action = var2;
      this.listOperations = var3;
      this.changesetUpdateId = var4;
      this.forceReload = var5;
   }

   public operator fun component1(): List<ChatListItem> {
      return this.items;
   }

   public operator fun component2(): ChatListAction {
      return this.action;
   }

   public operator fun component3(): List<ListOperation>? {
      return this.listOperations;
   }

   public operator fun component4(): Int {
      return this.changesetUpdateId;
   }

   public operator fun component5(): Boolean? {
      return this.forceReload;
   }

   public fun copy(
      items: List<ChatListItem> = var0.items,
      action: ChatListAction = var0.action,
      listOperations: List<ListOperation>? = var0.listOperations,
      changesetUpdateId: Int = var0.changesetUpdateId,
      forceReload: Boolean? = var0.forceReload
   ): ChatListUpdate {
      return new ChatListUpdate(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatListUpdate) {
         return false;
      } else {
         var1 = var1;
         if (!(this.items == var1.items)) {
            return false;
         } else if (!(this.action == var1.action)) {
            return false;
         } else if (!(this.listOperations == var1.listOperations)) {
            return false;
         } else if (this.changesetUpdateId != var1.changesetUpdateId) {
            return false;
         } else {
            return this.forceReload == var1.forceReload;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.items.hashCode();
      val var3: Int = this.action.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.listOperations == null) {
         var1 = 0;
      } else {
         var1 = this.listOperations.hashCode();
      }

      val var5: Int = Integer.hashCode(this.changesetUpdateId);
      if (this.forceReload != null) {
         var2 = this.forceReload.hashCode();
      }

      return (((var4 * 31 + var3) * 31 + var1) * 31 + var5) * 31 + var2;
   }

   public override fun toString(): String {
      val var4: java.util.List = this.items;
      val var3: ChatListAction = this.action;
      val var5: java.util.List = this.listOperations;
      val var1: Int = this.changesetUpdateId;
      val var2: java.lang.Boolean = this.forceReload;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ChatListUpdate(items=");
      var6.append(var4);
      var6.append(", action=");
      var6.append(var3);
      var6.append(", listOperations=");
      var6.append(var5);
      var6.append(", changesetUpdateId=");
      var6.append(var1);
      var6.append(", forceReload=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }
}
