package com.discord.chat.reactevents

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
internal data class InitiateThreadData(messageId: MessageId, channelId: ChannelId) : InitiateThreadData(var1, var2), ReactEvent {
   public final val messageId: MessageId
   public final val channelId: ChannelId

   fun InitiateThreadData(var1: java.lang.String, var2: Long) {
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

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ...): InitiateThreadData {
      return new InitiateThreadData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InitiateThreadData) {
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
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("InitiateThreadData(messageId=");
      var2.append(var1);
      var2.append(", channelId=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<InitiateThreadData> {
         return InitiateThreadData.$serializer.INSTANCE;
      }
   }
}
