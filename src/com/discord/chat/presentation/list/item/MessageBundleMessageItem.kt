package com.discord.chat.presentation.list.item

import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class MessageBundleMessageItem(messageItem: MessageItem) : MessageBundleItem {
   public final val messageItem: MessageItem

   init {
      r.h(var1, "messageItem");
      super(MessageId.toString-impl(var1.getMessage().getId-3Eiw7ao()), null);
      this.messageItem = var1;
   }

   public operator fun component1(): MessageItem {
      return this.messageItem;
   }

   public fun copy(messageItem: MessageItem = var0.messageItem): MessageBundleMessageItem {
      r.h(var1, "messageItem");
      return new MessageBundleMessageItem(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageBundleMessageItem) {
         return false;
      } else {
         return r.c(this.messageItem, (var1 as MessageBundleMessageItem).messageItem);
      }
   }

   public override fun hashCode(): Int {
      return this.messageItem.hashCode();
   }

   public override fun toString(): String {
      val var2: MessageItem = this.messageItem;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MessageBundleMessageItem(messageItem=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
