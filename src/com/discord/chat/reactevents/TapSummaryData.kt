package com.discord.chat.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class TapSummaryData(channelId: String, messageId: String, summaryId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val summaryId: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "summaryId");
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

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId, summaryId: String = var0.summaryId): TapSummaryData {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "summaryId");
      return new TapSummaryData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSummaryData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.summaryId, var1.summaryId);
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
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.messageId;
      val var4: java.lang.String = this.summaryId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapSummaryData(channelId=");
      var1.append(var3);
      var1.append(", messageId=");
      var1.append(var2);
      var1.append(", summaryId=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSummaryData> {
         return TapSummaryData.$serializer.INSTANCE;
      }
   }
}
