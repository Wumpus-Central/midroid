package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class OnTruncateMessageData(messageId: MessageId) : OnTruncateMessageData(var1), ReactEvent {
   public final val messageId: MessageId

   fun OnTruncateMessageData(var1: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): OnTruncateMessageData {
      q.h(var1, "messageId");
      return new OnTruncateMessageData(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnTruncateMessageData) {
         return false;
      } else {
         return MessageId.equals-impl0(this.messageId, (var1 as OnTruncateMessageData).messageId);
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnTruncateMessageData(messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnTruncateMessageData> {
         return OnTruncateMessageData.$serializer.INSTANCE;
      }
   }
}
