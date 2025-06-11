package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class SafetyPolicyNoticeMessageAccessory(messageId: MessageId, safetyPolicyNoticeEmbed: SafetyPolicyNoticeEmbed) : SafetyPolicyNoticeMessageAccessory(
      var1, var2
   ) {
   public open val messageId: MessageId
   public final val safetyPolicyNoticeEmbed: SafetyPolicyNoticeEmbed

   fun SafetyPolicyNoticeMessageAccessory(var1: java.lang.String, var2: SafetyPolicyNoticeEmbed) {
      q.h(var1, "messageId");
      q.h(var2, "safetyPolicyNoticeEmbed");
      super(var1, "safety policy notice embed", false, 4, null);
      this.messageId = var1;
      this.safetyPolicyNoticeEmbed = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): SafetyPolicyNoticeEmbed {
      return this.safetyPolicyNoticeEmbed;
   }

   public fun copy(messageId: MessageId = ..., safetyPolicyNoticeEmbed: SafetyPolicyNoticeEmbed = ...): SafetyPolicyNoticeMessageAccessory {
      q.h(var1, "messageId");
      q.h(var2, "safetyPolicyNoticeEmbed");
      return new SafetyPolicyNoticeMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafetyPolicyNoticeMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.safetyPolicyNoticeEmbed, var1.safetyPolicyNoticeEmbed);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.safetyPolicyNoticeEmbed.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: SafetyPolicyNoticeEmbed = this.safetyPolicyNoticeEmbed;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SafetyPolicyNoticeMessageAccessory(messageId=");
      var2.append(var3);
      var2.append(", safetyPolicyNoticeEmbed=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
