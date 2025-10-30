package com.discord.chat.reactevents

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
internal data class InitiateReplyData(messageId: MessageId, channelId: ChannelId, triggerHaptic: Boolean? = ..., location: String?) : InitiateReplyData(
         var1, var2, var4, var5
      ),
   ReactEvent {
   public final val messageId: MessageId
   public final val channelId: ChannelId
   public final val triggerHaptic: Boolean?
   public final val location: String?

   fun InitiateReplyData(var1: java.lang.String, var2: Long, var4: java.lang.Boolean, var5: java.lang.String) {
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.triggerHaptic = var4;
      this.location = var5;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): Boolean? {
      return this.triggerHaptic;
   }

   public operator fun component4(): String? {
      return this.location;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ..., triggerHaptic: Boolean? = ..., location: String? = ...): InitiateReplyData {
      return new InitiateReplyData(var1, var2, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InitiateReplyData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!(this.triggerHaptic == var1.triggerHaptic)) {
            return false;
         } else {
            return this.location == var1.location;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      val var4: Int = ChannelId.hashCode-impl(this.channelId);
      var var2: Int = 0;
      val var1: Int;
      if (this.triggerHaptic == null) {
         var1 = 0;
      } else {
         var1 = this.triggerHaptic.hashCode();
      }

      if (this.location != null) {
         var2 = this.location.hashCode();
      }

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: java.lang.Boolean = this.triggerHaptic;
      val var2: java.lang.String = this.location;
      val var3: StringBuilder = new StringBuilder();
      var3.append("InitiateReplyData(messageId=");
      var3.append(var1);
      var3.append(", channelId=");
      var3.append(var5);
      var3.append(", triggerHaptic=");
      var3.append(var4);
      var3.append(", location=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<InitiateReplyData> {
         return InitiateReplyData.$serializer.INSTANCE;
      }
   }
}
