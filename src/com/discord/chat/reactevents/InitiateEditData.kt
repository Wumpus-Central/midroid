package com.discord.chat.reactevents

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
internal data class InitiateEditData(messageId: MessageId, channelId: ChannelId) : InitiateEditData(var1, var2), ReactEvent {
   public final val messageId: MessageId
   public final val channelId: ChannelId

   fun InitiateEditData(var1: java.lang.String, var2: Long) {
      r.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.channelId = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ...): InitiateEditData {
      r.h(var1, "messageId");
      return new InitiateEditData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InitiateEditData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + ChannelId.hashCode-impl(this.channelId);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: StringBuilder = new StringBuilder();
      var3.append("InitiateEditData(messageId=");
      var3.append(var1);
      var3.append(", channelId=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<InitiateEditData> {
         return InitiateEditData.$serializer.INSTANCE;
      }
   }
}
