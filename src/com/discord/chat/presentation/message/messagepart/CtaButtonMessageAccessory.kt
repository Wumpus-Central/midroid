package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.ctabutton.CtaButton
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class CtaButtonMessageAccessory(channelId: ChannelId, messageId: MessageId, ctaButton: CtaButton) : CtaButtonMessageAccessory(var1, var3, var4) {
   public final val channelId: ChannelId
   public final val ctaButton: CtaButton
   public open val messageId: MessageId

   fun CtaButtonMessageAccessory(var1: Long, var3: java.lang.String, var4: CtaButton) {
      q.h(var3, "messageId");
      q.h(var4, "ctaButton");
      super(var3, "cta button", false, 4, null);
      this.channelId = var1;
      this.messageId = var3;
      this.ctaButton = var4;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): MessageId {
      return this.messageId;
   }

   public operator fun component3(): CtaButton {
      return this.ctaButton;
   }

   public fun copy(channelId: ChannelId = ..., messageId: MessageId = ..., ctaButton: CtaButton = ...): CtaButtonMessageAccessory {
      q.h(var3, "messageId");
      q.h(var4, "ctaButton");
      return new CtaButtonMessageAccessory(var1, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CtaButtonMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.ctaButton, var1.ctaButton);
         }
      }
   }

   public override fun hashCode(): Int {
      return (ChannelId.hashCode-impl(this.channelId) * 31 + MessageId.hashCode-impl(this.messageId)) * 31 + this.ctaButton.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: CtaButton = this.ctaButton;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CtaButtonMessageAccessory(channelId=");
      var2.append(var1);
      var2.append(", messageId=");
      var2.append(var3);
      var2.append(", ctaButton=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }
}
