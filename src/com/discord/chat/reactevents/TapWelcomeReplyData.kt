package com.discord.chat.reactevents

import ch.w
import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q

public data class TapWelcomeReplyData(stickerId: Long, messageId: MessageId) : TapWelcomeReplyData(var1, var3), ReactEvent {
   public final val messageId: MessageId
   public final val stickerId: Long

   fun TapWelcomeReplyData(var1: Long, var3: java.lang.String) {
      q.h(var3, "messageId");
      super();
      this.stickerId = var1;
      this.messageId = var3;
   }

   public operator fun component1(): Long {
      return this.stickerId;
   }

   public operator fun component2(): MessageId {
      return this.messageId;
   }

   public fun copy(stickerId: Long = ..., messageId: MessageId = ...): TapWelcomeReplyData {
      q.h(var3, "messageId");
      return new TapWelcomeReplyData(var1, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapWelcomeReplyData) {
         return false;
      } else {
         var1 = var1;
         if (this.stickerId != var1.stickerId) {
            return false;
         } else {
            return MessageId.equals-impl0(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Long.hashCode(this.stickerId) * 31 + MessageId.hashCode-impl(this.messageId);
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("messageId", MessageId.toString-impl(this.messageId)), w.a("stickerId", java.lang.String.valueOf(this.stickerId))
      );
   }

   public override fun toString(): String {
      val var1: Long = this.stickerId;
      val var4: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapWelcomeReplyData(stickerId=");
      var3.append(var1);
      var3.append(", messageId=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }
}
