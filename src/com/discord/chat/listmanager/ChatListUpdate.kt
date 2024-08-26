package com.discord.chat.listmanager

import com.discord.chat.presentation.list.item.ChatListItem
import kotlin.jvm.internal.r

public data class ChatListUpdate(items: List<ChatListItem>, action: ChatListAction, listOperations: List<ListOperation>?, changesetUpdateId: Int) {
   public final val action: ChatListAction
   public final val changesetUpdateId: Int
   public final val items: List<ChatListItem>
   public final val listOperations: List<ListOperation>?

   init {
      r.h(var1, "items");
      r.h(var2, "action");
      super();
      this.items = var1;
      this.action = var2;
      this.listOperations = var3;
      this.changesetUpdateId = var4;
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

   public fun copy(
      items: List<ChatListItem> = var0.items,
      action: ChatListAction = var0.action,
      listOperations: List<ListOperation>? = var0.listOperations,
      changesetUpdateId: Int = var0.changesetUpdateId
   ): ChatListUpdate {
      r.h(var1, "items");
      r.h(var2, "action");
      return new ChatListUpdate(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatListUpdate) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.items, var1.items)) {
            return false;
         } else if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!r.c(this.listOperations, var1.listOperations)) {
            return false;
         } else {
            return this.changesetUpdateId == var1.changesetUpdateId;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.items.hashCode();
      val var2: Int = this.action.hashCode();
      val var1: Int;
      if (this.listOperations == null) {
         var1 = 0;
      } else {
         var1 = this.listOperations.hashCode();
      }

      return ((var3 * 31 + var2) * 31 + var1) * 31 + Integer.hashCode(this.changesetUpdateId);
   }

   public override fun toString(): String {
      val var3: java.util.List = this.items;
      val var5: ChatListAction = this.action;
      val var2: java.util.List = this.listOperations;
      val var1: Int = this.changesetUpdateId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ChatListUpdate(items=");
      var4.append(var3);
      var4.append(", action=");
      var4.append(var5);
      var4.append(", listOperations=");
      var4.append(var2);
      var4.append(", changesetUpdateId=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
