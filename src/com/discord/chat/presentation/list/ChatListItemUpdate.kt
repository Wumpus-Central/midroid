package com.discord.chat.presentation.list

import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ListOperation
import com.discord.chat.presentation.list.item.ChatListItem
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public data class ChatListItemUpdate(items: List<ChatListItem>,
      listOperations: List<ListOperation>?,
      chatListAction: ChatListAction?,
      updateId: Int,
      preCommit: (Boolean) -> Unit,
      postCommit: () -> Unit
   )
   : ChannelChatListAdapterUpdate {
   public final val items: List<ChatListItem>
   public final val listOperations: List<ListOperation>?
   public final val chatListAction: ChatListAction?
   public open val updateId: Int
   public open val preCommit: (Boolean) -> Unit
   public open val postCommit: () -> Unit

   init {
      q.h(var1, "items");
      q.h(var5, "preCommit");
      q.h(var6, "postCommit");
      super(var4, var5, var6, null);
      this.items = var1;
      this.listOperations = var2;
      this.chatListAction = var3;
      this.updateId = var4;
      this.preCommit = var5;
      this.postCommit = var6;
   }

   public operator fun component1(): List<ChatListItem> {
      return this.items;
   }

   public operator fun component2(): List<ListOperation>? {
      return this.listOperations;
   }

   public operator fun component3(): ChatListAction? {
      return this.chatListAction;
   }

   public operator fun component4(): Int {
      return this.updateId;
   }

   public operator fun component5(): (Boolean) -> Unit {
      return this.preCommit;
   }

   public operator fun component6(): () -> Unit {
      return this.postCommit;
   }

   public fun copy(
      items: List<ChatListItem> = var0.items,
      listOperations: List<ListOperation>? = var0.listOperations,
      chatListAction: ChatListAction? = var0.chatListAction,
      updateId: Int = var0.updateId,
      preCommit: (Boolean) -> Unit = var0.preCommit,
      postCommit: () -> Unit = var0.postCommit
   ): ChatListItemUpdate {
      q.h(var1, "items");
      q.h(var5, "preCommit");
      q.h(var6, "postCommit");
      return new ChatListItemUpdate(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatListItemUpdate) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.items, var1.items)) {
            return false;
         } else if (!q.c(this.listOperations, var1.listOperations)) {
            return false;
         } else if (!q.c(this.chatListAction, var1.chatListAction)) {
            return false;
         } else if (this.updateId != var1.updateId) {
            return false;
         } else if (!q.c(this.preCommit, var1.preCommit)) {
            return false;
         } else {
            return q.c(this.postCommit, var1.postCommit);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.items.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.listOperations == null) {
         var1 = 0;
      } else {
         var1 = this.listOperations.hashCode();
      }

      if (this.chatListAction != null) {
         var2 = this.chatListAction.hashCode();
      }

      return ((((var3 * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.updateId)) * 31 + this.preCommit.hashCode()) * 31 + this.postCommit.hashCode();
   }

   public override fun toString(): String {
      val var4: java.util.List = this.items;
      val var3: java.util.List = this.listOperations;
      val var7: ChatListAction = this.chatListAction;
      val var1: Int = this.updateId;
      val var2: Function1 = this.preCommit;
      val var6: Function0 = this.postCommit;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ChatListItemUpdate(items=");
      var5.append(var4);
      var5.append(", listOperations=");
      var5.append(var3);
      var5.append(", chatListAction=");
      var5.append(var7);
      var5.append(", updateId=");
      var5.append(var1);
      var5.append(", preCommit=");
      var5.append(var2);
      var5.append(", postCommit=");
      var5.append(var6);
      var5.append(")");
      return var5.toString();
   }
}
