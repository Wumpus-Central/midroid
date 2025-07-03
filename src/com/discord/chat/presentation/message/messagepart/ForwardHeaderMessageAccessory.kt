package com.discord.chat.presentation.message.messagepart

import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class ForwardHeaderMessageAccessory(messageId: MessageId) : ForwardHeaderMessageAccessory(var1) {
   public open val messageId: MessageId

   fun ForwardHeaderMessageAccessory(var1: java.lang.String) {
      r.h(var1, "messageId");
      super(var1, "forwarded message header", false, 4, null);
      this.messageId = var1;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): ForwardHeaderMessageAccessory {
      r.h(var1, "messageId");
      return new ForwardHeaderMessageAccessory(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForwardHeaderMessageAccessory) {
         return false;
      } else {
         return MessageId.equals-impl0(this.messageId, (var1 as ForwardHeaderMessageAccessory).messageId);
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId);
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("ForwardHeaderMessageAccessory(messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
