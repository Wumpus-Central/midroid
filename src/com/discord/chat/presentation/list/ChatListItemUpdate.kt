package com.discord.chat.presentation.list

import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ListOperation
import com.discord.chat.presentation.list.item.ChatListItem
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

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
      r.h(var1, "items");
      r.h(var5, "preCommit");
      r.h(var6, "postCommit");
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
      return this.getUpdateId();
   }

   public operator fun component5(): (Boolean) -> Unit {
      return this.getPreCommit();
   }

   public operator fun component6(): () -> Unit {
      return this.getPostCommit();
   }

   public fun copy(
      items: List<ChatListItem> = var0.items,
      listOperations: List<ListOperation>? = var0.listOperations,
      chatListAction: ChatListAction? = var0.chatListAction,
      updateId: Int = var0.getUpdateId(),
      preCommit: (Boolean) -> Unit = var0.getPreCommit(),
      postCommit: () -> Unit = var0.getPostCommit()
   ): ChatListItemUpdate {
      r.h(var1, "items");
      r.h(var5, "preCommit");
      r.h(var6, "postCommit");
      return new ChatListItemUpdate(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatListItemUpdate) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.items, var1.items)) {
            return false;
         } else if (!r.c(this.listOperations, var1.listOperations)) {
            return false;
         } else if (!r.c(this.chatListAction, var1.chatListAction)) {
            return false;
         } else if (this.getUpdateId() != var1.getUpdateId()) {
            return false;
         } else if (!r.c(this.getPreCommit(), var1.getPreCommit())) {
            return false;
         } else {
            return r.c(this.getPostCommit(), var1.getPostCommit());
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

      return ((((var3 * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.getUpdateId())) * 31 + this.getPreCommit().hashCode()) * 31
         + this.getPostCommit().hashCode();
   }

   public override fun toString(): String {
      val var6: java.util.List = this.items;
      val var3: java.util.List = this.listOperations;
      val var4: ChatListAction = this.chatListAction;
      val var1: Int = this.getUpdateId();
      val var5: Function1 = this.getPreCommit();
      val var7: Function0 = this.getPostCommit();
      val var2: StringBuilder = new StringBuilder();
      var2.append("ChatListItemUpdate(items=");
      var2.append(var6);
      var2.append(", listOperations=");
      var2.append(var3);
      var2.append(", chatListAction=");
      var2.append(var4);
      var2.append(", updateId=");
      var2.append(var1);
      var2.append(", preCommit=");
      var2.append(var5);
      var2.append(", postCommit=");
      var2.append(var7);
      var2.append(")");
      return var2.toString();
   }
}
