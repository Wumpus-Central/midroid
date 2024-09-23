package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import com.discord.chat.presentation.root.MessageContext
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class FlaggedMessageEmbedAccessory(messageId: MessageId, message: Message, messageContext: MessageContext) : FlaggedMessageEmbedAccessory(
      var1, var2, var3
   ) {
   public final val message: Message
   public final val messageContext: MessageContext
   public open val messageId: MessageId

   fun FlaggedMessageEmbedAccessory(var1: java.lang.String, var2: Message, var3: MessageContext) {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "messageContext");
      super(var1, "flagged-message-embed", false, 4, null);
      this.messageId = var1;
      this.message = var2;
      this.messageContext = var3;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Message {
      return this.message;
   }

   public operator fun component3(): MessageContext {
      return this.messageContext;
   }

   public fun copy(messageId: MessageId = ..., message: Message = ..., messageContext: MessageContext = ...): FlaggedMessageEmbedAccessory {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "messageContext");
      return new FlaggedMessageEmbedAccessory(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FlaggedMessageEmbedAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return q.c(this.messageContext, var1.messageContext);
         }
      }
   }

   public override fun hashCode(): Int {
      return (MessageId.hashCode-impl(this.messageId) * 31 + this.message.hashCode()) * 31 + this.messageContext.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Message = this.message;
      val var2: MessageContext = this.messageContext;
      val var3: StringBuilder = new StringBuilder();
      var3.append("FlaggedMessageEmbedAccessory(messageId=");
      var3.append(var4);
      var3.append(", message=");
      var3.append(var1);
      var3.append(", messageContext=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
