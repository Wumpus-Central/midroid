package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.interaction.InteractionStatus
import com.discord.primitives.MessageId

public data class InteractionStatusMessageAccessory(messageId: MessageId, interactionStatus: InteractionStatus) : InteractionStatusMessageAccessory(var1, var2) {
   public open val messageId: MessageId
   public final val interactionStatus: InteractionStatus

   fun InteractionStatusMessageAccessory(var1: java.lang.String, var2: InteractionStatus) {
      super(var1, "interaction status", false, 4, null);
      this.messageId = var1;
      this.interactionStatus = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): InteractionStatus {
      return this.interactionStatus;
   }

   public fun copy(messageId: MessageId = ..., interactionStatus: InteractionStatus = ...): InteractionStatusMessageAccessory {
      return new InteractionStatusMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InteractionStatusMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return this.interactionStatus == var1.interactionStatus;
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.interactionStatus.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: InteractionStatus = this.interactionStatus;
      val var3: StringBuilder = new StringBuilder();
      var3.append("InteractionStatusMessageAccessory(messageId=");
      var3.append(var1);
      var3.append(", interactionStatus=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
