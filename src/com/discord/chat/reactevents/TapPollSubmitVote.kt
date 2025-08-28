package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class TapPollSubmitVote(channelId: String, messageId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String

   init {
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
      return new TapPollSubmitVote(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollSubmitVote) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else {
            return this.messageId == var1.messageId;
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
      val var3: java.lang.String = this.channelId;
      val var1: java.lang.String = this.messageId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapPollSubmitVote(channelId=");
      var2.append(var3);
      var2.append(", messageId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollSubmitVote> {
         return TapPollSubmitVote.$serializer.INSTANCE;
      }
   }
}
