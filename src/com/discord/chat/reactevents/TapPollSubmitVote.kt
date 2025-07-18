package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class TapPollSubmitVote(channelId: String, messageId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String

   init {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      super();
      this.channelId = var1;
      this.messageId = var2;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId): TapPollSubmitVote {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      return new TapPollSubmitVote(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollSubmitVote) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.channelId.hashCode() * 31 + this.messageId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.channelId;
      val var2: java.lang.String = this.messageId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapPollSubmitVote(channelId=");
      var3.append(var1);
      var3.append(", messageId=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollSubmitVote> {
         return TapPollSubmitVote.$serializer.INSTANCE;
      }
   }
}
