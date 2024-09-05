package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import vj.w

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

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("messageId", MessageId.toString-impl(this.messageId))});
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapInviteToSpeakData(messageId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
