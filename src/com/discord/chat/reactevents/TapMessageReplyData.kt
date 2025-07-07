package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
internal data class TapMessageReplyData(channelId: String, originId: String) : ReactEvent {
   public final val channelId: String
   public final val originId: String

   init {
      r.h(var1, "channelId");
      r.h(var2, "originId");
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
      r.h(var1, "channelId");
      r.h(var2, "originId");
      return new TapMessageReplyData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapMessageReplyData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.originId, var1.originId);
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
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.originId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapMessageReplyData(channelId=");
      var1.append(var3);
      var1.append(", originId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapMessageReplyData> {
         return TapMessageReplyData.$serializer.INSTANCE;
      }
   }
}
