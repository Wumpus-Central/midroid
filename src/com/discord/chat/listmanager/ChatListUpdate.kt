package com.discord.chat.listmanager

import com.discord.chat.presentation.list.item.ChatListItem
import kotlin.jvm.internal.r

public data class ChatListUpdate(items: List<ChatListItem>, action: ChatListAction, listOperations: List<ListOperation>?) {
   public final val action: ChatListAction
   public final val items: List<ChatListItem>
   public final val listOperations: List<ListOperation>?

   init {
      r.h(var1, "items");
      r.h(var2, "action");
      super();
      this.items = var1;
      this.action = var2;
      this.listOperations = var3;
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

   public fun copy(items: List<ChatListItem> = var0.items, action: ChatListAction = var0.action, listOperations: List<ListOperation>? = var0.listOperations): ChatListUpdate {
      r.h(var1, "items");
      r.h(var2, "action");
      return new ChatListUpdate(var1, var2, var3);
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
         } else {
            return r.c(this.listOperations, var1.listOperations);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.items.hashCode();
      val var3: Int = this.action.hashCode();
      val var1: Int;
      if (this.listOperations == null) {
         var1 = 0;
      } else {
         var1 = this.listOperations.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.util.List = this.items;
      val var1: ChatListAction = this.action;
      val var4: java.util.List = this.listOperations;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ChatListUpdate(items=");
      var3.append(var2);
      var3.append(", action=");
      var3.append(var1);
      var3.append(", listOperations=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }
}
