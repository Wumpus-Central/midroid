package com.discord.chat.presentation.list.item

import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class MessageBundleConversationItem(messageItem: MessageItem) : MessageBundleItem {
   public final val messageItem: MessageItem

   init {
      r.h(var1, "messageItem");
      super(MessageId.toString-impl(var1.getMessage().getId-3Eiw7ao()), null);
      this.messageItem = var1;
   }

   public operator fun component1(): MessageItem {
      return this.messageItem;
   }

   public fun copy(messageItem: MessageItem = var0.messageItem): MessageBundleConversationItem {
      r.h(var1, "messageItem");
      return new MessageBundleConversationItem(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageBundleConversationItem) {
         return false;
      } else {
         return r.c(this.messageItem, (var1 as MessageBundleConversationItem).messageItem);
      }
   }

   public override fun hashCode(): Int {
      return this.messageItem.hashCode();
   }

   public override fun toString(): String {
      val var2: MessageItem = this.messageItem;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MessageBundleConversationItem(messageItem=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
