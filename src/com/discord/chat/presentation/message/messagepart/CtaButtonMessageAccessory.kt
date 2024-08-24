package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.ctabutton.CtaButton
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class CtaButtonMessageAccessory(channelId: ChannelId, messageId: MessageId, ctaButton: CtaButton) : CtaButtonMessageAccessory(var1, var3, var4) {
   public final val channelId: ChannelId
   public final val ctaButton: CtaButton
   public open val messageId: MessageId

   fun CtaButtonMessageAccessory(var1: Long, var3: java.lang.String, var4: CtaButton) {
      super(var3, "cta button", false, 4, null);
      this.channelId = var1;
      this.messageId = var3;
      this.ctaButton = var4;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component3(): CtaButton {
      return this.ctaButton;
   }

   public fun copy(channelId: ChannelId = ..., messageId: MessageId = ..., ctaButton: CtaButton = ...): CtaButtonMessageAccessory {
      r.h(var3, "messageId");
      r.h(var4, "ctaButton");
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
         } else if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return r.c(this.ctaButton, var1.ctaButton);
         }
      }
   }

   public override fun hashCode(): Int {
      return (ChannelId.hashCode-impl(this.channelId) * 31 + MessageId.hashCode-impl(this.getMessageId-3Eiw7ao())) * 31 + this.ctaButton.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var1: CtaButton = this.ctaButton;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CtaButtonMessageAccessory(channelId=");
      var4.append(var2);
      var4.append(", messageId=");
      var4.append(var3);
      var4.append(", ctaButton=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
