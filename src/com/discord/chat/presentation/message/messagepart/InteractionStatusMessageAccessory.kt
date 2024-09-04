package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.interaction.InteractionStatus
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class InteractionStatusMessageAccessory(messageId: MessageId, interactionStatus: InteractionStatus) : InteractionStatusMessageAccessory(var1, var2) {
   public final val interactionStatus: InteractionStatus
   public open val messageId: MessageId

   fun InteractionStatusMessageAccessory(var1: java.lang.String, var2: InteractionStatus) {
      super(var1, "interaction status", false, 4, null);
      this.messageId = var1;
      this.interactionStatus = var2;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): InteractionStatus {
      return this.interactionStatus;
   }

   public fun copy(messageId: MessageId = ..., interactionStatus: InteractionStatus = ...): InteractionStatusMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "interactionStatus");
      return new InteractionStatusMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InteractionStatusMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return r.c(this.interactionStatus, var1.interactionStatus);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + this.interactionStatus.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var3: InteractionStatus = this.interactionStatus;
      val var1: StringBuilder = new StringBuilder();
      var1.append("InteractionStatusMessageAccessory(messageId=");
      var1.append(var2);
      var1.append(", interactionStatus=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }
}
