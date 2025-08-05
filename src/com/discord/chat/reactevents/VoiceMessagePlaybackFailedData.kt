package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class VoiceMessagePlaybackFailedData(messageId: MessageId, errorMessage: String?) : VoiceMessagePlaybackFailedData(var1, var2), ReactEvent {
   public final val messageId: MessageId
   public final val errorMessage: String?

   fun VoiceMessagePlaybackFailedData(var1: java.lang.String, var2: java.lang.String) {
      r.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.errorMessage = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): String? {
      return this.errorMessage;
   }

   public fun copy(messageId: MessageId = ..., errorMessage: String? = ...): VoiceMessagePlaybackFailedData {
      r.h(var1, "messageId");
      return new VoiceMessagePlaybackFailedData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VoiceMessagePlaybackFailedData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.errorMessage, var1.errorMessage);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = MessageId.hashCode-impl(this.messageId);
      val var1: Int;
      if (this.errorMessage == null) {
         var1 = 0;
      } else {
         var1 = this.errorMessage.hashCode();
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: java.lang.String = this.errorMessage;
      val var2: StringBuilder = new StringBuilder();
      var2.append("VoiceMessagePlaybackFailedData(messageId=");
      var2.append(var3);
      var2.append(", errorMessage=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<VoiceMessagePlaybackFailedData> {
         return VoiceMessagePlaybackFailedData.$serializer.INSTANCE;
      }
   }
}
