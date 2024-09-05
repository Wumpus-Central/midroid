package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import kotlin.jvm.internal.q

public data class CallSystemMessageItem(message: Message) : ChatListItem {
   public final val message: Message

   init {
      q.h(var1, "message");
      super(var1.getId-3Eiw7ao(), null);
      this.message = var1;
      if (!MessageKt.isCallMessage(var1)) {
         throw new IllegalArgumentException("Only \"call\" system messages are allowed".toString());
      }
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): CallSystemMessageItem {
      q.h(var1, "message");
      return new CallSystemMessageItem(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CallSystemMessageItem) {
         return false;
      } else {
         return q.c(this.message, (var1 as CallSystemMessageItem).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var1: Message = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CallSystemMessageItem(message=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
