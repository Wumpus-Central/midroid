package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
internal data class TapMessageReplyData(channelId: String, originId: String) : ReactEvent {
   public final val channelId: String
   public final val originId: String

   init {
      super();
      this.channelId = var1;
      this.originId = var2;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.originId;
   }

   public fun copy(channelId: String = var0.channelId, originId: String = var0.originId): TapMessageReplyData {
      return new TapMessageReplyData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapMessageReplyData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else {
            return this.originId == var1.originId;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.channelId.hashCode() * 31 + this.originId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.channelId;
      val var1: java.lang.String = this.originId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapMessageReplyData(channelId=");
      var3.append(var2);
      var3.append(", originId=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapMessageReplyData> {
         return TapMessageReplyData.$serializer.INSTANCE;
      }
   }
}
