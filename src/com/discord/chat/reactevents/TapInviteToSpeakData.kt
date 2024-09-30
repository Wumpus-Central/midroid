package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kh.w
import kotlin.jvm.internal.q

public data class TapInviteToSpeakData(messageId: MessageId) : TapInviteToSpeakData(var1), ReactEvent {
   public final val messageId: MessageId

   fun TapInviteToSpeakData(var1: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): TapInviteToSpeakData {
      q.h(var1, "messageId");
      return new TapInviteToSpeakData(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInviteToSpeakData) {
         return false;
      } else {
         return MessageId.equals-impl0(this.messageId, (var1 as TapInviteToSpeakData).messageId);
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId);
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("messageId", MessageId.toString-impl(this.messageId)));
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapInviteToSpeakData(messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
