package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.referral.ReferralEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class ReferralMessageAccessory(messageId: MessageId, referral: ReferralEmbed) : ReferralMessageAccessory(var1, var2) {
   public open val messageId: MessageId
   public final val referral: ReferralEmbed

   fun ReferralMessageAccessory(var1: java.lang.String, var2: ReferralEmbed) {
      r.h(var1, "messageId");
      r.h(var2, "referral");
      super(var1, "referral", false, 4, null);
      this.messageId = var1;
      this.referral = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ReferralEmbed {
      return this.referral;
   }

   public fun copy(messageId: MessageId = ..., referral: ReferralEmbed = ...): ReferralMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "referral");
      return new ReferralMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReferralMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.referral, var1.referral);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.referral.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: ReferralEmbed = this.referral;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ReferralMessageAccessory(messageId=");
      var2.append(var1);
      var2.append(", referral=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
