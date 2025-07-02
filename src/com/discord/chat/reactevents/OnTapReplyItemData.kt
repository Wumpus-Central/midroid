package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import lb.f

@f
public data class OnTapReplyItemData(messageId: MessageId) : OnTapReplyItemData(var1), ReactEvent {
   public final val messageId: MessageId

   fun OnTapReplyItemData(var1: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): OnTapReplyItemData {
      q.h(var1, "messageId");
      return new OnTapReplyItemData(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnTapReplyItemData) {
         return false;
      } else {
         return MessageId.equals-impl0(this.messageId, (var1 as OnTapReplyItemData).messageId);
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnTapReplyItemData(messageId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnTapReplyItemData> {
         return OnTapReplyItemData.$serializer.INSTANCE;
      }
   }
}
