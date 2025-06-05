package com.discord.chat.reactevents

import Xa.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapPollAnswer(channelId: String, messageId: String, answerId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val answerId: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "answerId");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.answerId = var3;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public operator fun component3(): String {
      return this.answerId;
   }

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId, answerId: String = var0.answerId): TapPollAnswer {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "answerId");
      return new TapPollAnswer(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollAnswer) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.answerId, var1.answerId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.answerId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.channelId;
      val var1: java.lang.String = this.messageId;
      val var3: java.lang.String = this.answerId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapPollAnswer(channelId=");
      var4.append(var2);
      var4.append(", messageId=");
      var4.append(var1);
      var4.append(", answerId=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollAnswer> {
         return TapPollAnswer.$serializer.INSTANCE;
      }
   }
}
