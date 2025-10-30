package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
public data class TapDismissMediaPostSharePromptData(messageId: MessageId) : TapDismissMediaPostSharePromptData(var1), ReactEvent {
   public final val messageId: MessageId

   fun TapDismissMediaPostSharePromptData(var1: java.lang.String) {
      super();
      this.messageId = var1;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): TapDismissMediaPostSharePromptData {
      return new TapDismissMediaPostSharePromptData(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapDismissMediaPostSharePromptData) {
         return false;
      } else {
         return MessageId.equals-impl0(this.messageId, (var1 as TapDismissMediaPostSharePromptData).messageId);
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapDismissMediaPostSharePromptData(messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapDismissMediaPostSharePromptData> {
         return TapDismissMediaPostSharePromptData.$serializer.INSTANCE;
      }
   }
}
