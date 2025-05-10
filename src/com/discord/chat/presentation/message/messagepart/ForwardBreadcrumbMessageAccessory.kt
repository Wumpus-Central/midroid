package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.forwarding.ForwardInfo
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class ForwardBreadcrumbMessageAccessory(messageId: MessageId, channelId: ChannelId, forwardInfo: ForwardInfo) : ForwardBreadcrumbMessageAccessory(
      var1, var2, var4
   ) {
   public final val channelId: ChannelId
   public final val forwardInfo: ForwardInfo
   public open val messageId: MessageId

   fun ForwardBreadcrumbMessageAccessory(var1: java.lang.String, var2: Long, var4: ForwardInfo) {
      q.h(var1, "messageId");
      q.h(var4, "forwardInfo");
      super(var1, "forwarded message breadcrumb", false, 4, null);
      this.messageId = var1;
      this.channelId = var2;
      this.forwardInfo = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): ForwardInfo {
      return this.forwardInfo;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ..., forwardInfo: ForwardInfo = ...): ForwardBreadcrumbMessageAccessory {
      q.h(var1, "messageId");
      q.h(var4, "forwardInfo");
      return new ForwardBreadcrumbMessageAccessory(var1, var2, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForwardBreadcrumbMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.forwardInfo, var1.forwardInfo);
         }
      }
   }

   public override fun hashCode(): Int {
      return (MessageId.hashCode-impl(this.messageId) * 31 + ChannelId.hashCode-impl(this.channelId)) * 31 + this.forwardInfo.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: ForwardInfo = this.forwardInfo;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ForwardBreadcrumbMessageAccessory(messageId=");
      var3.append(var1);
      var3.append(", channelId=");
      var3.append(var2);
      var3.append(", forwardInfo=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }
}
