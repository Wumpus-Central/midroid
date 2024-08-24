package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class SafetySystemNotificationMessageAccessory(messageId: MessageId, safetySystemNotificationEmbed: SafetySystemNotificationEmbed) : SafetySystemNotificationMessageAccessory(
      var1, var2
   ) {
   public open val messageId: MessageId
   public final val safetySystemNotificationEmbed: SafetySystemNotificationEmbed

   fun SafetySystemNotificationMessageAccessory(var1: java.lang.String, var2: SafetySystemNotificationEmbed) {
      super(var1, "safety policy notice embed", false, 4, null);
      this.messageId = var1;
      this.safetySystemNotificationEmbed = var2;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): SafetySystemNotificationEmbed {
      return this.safetySystemNotificationEmbed;
   }

   public fun copy(messageId: MessageId = ..., safetySystemNotificationEmbed: SafetySystemNotificationEmbed = ...): SafetySystemNotificationMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "safetySystemNotificationEmbed");
      return new SafetySystemNotificationMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafetySystemNotificationMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return r.c(this.safetySystemNotificationEmbed, var1.safetySystemNotificationEmbed);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + this.safetySystemNotificationEmbed.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var3: SafetySystemNotificationEmbed = this.safetySystemNotificationEmbed;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SafetySystemNotificationMessageAccessory(messageId=");
      var2.append(var1);
      var2.append(", safetySystemNotificationEmbed=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
