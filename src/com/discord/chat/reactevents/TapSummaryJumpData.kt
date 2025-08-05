package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
internal data class TapSummaryJumpData(channelId: String, messageId: String, summaryId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val summaryId: String

   init {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "summaryId");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.summaryId = var3;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public operator fun component3(): String {
      return this.summaryId;
   }

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId, summaryId: String = var0.summaryId): TapSummaryJumpData {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "summaryId");
      return new TapSummaryJumpData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSummaryJumpData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.summaryId, var1.summaryId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.summaryId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.channelId;
      val var1: java.lang.String = this.messageId;
      val var3: java.lang.String = this.summaryId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapSummaryJumpData(channelId=");
      var4.append(var2);
      var4.append(", messageId=");
      var4.append(var1);
      var4.append(", summaryId=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSummaryJumpData> {
         return TapSummaryJumpData.$serializer.INSTANCE;
      }
   }
}
