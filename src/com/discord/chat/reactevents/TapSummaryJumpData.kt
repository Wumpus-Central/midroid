package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
internal data class TapSummaryJumpData(channelId: String, messageId: String, summaryId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val summaryId: String

   init {
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
      return new TapSummaryJumpData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSummaryJumpData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (!(this.messageId == var1.messageId)) {
            return false;
         } else {
            return this.summaryId == var1.summaryId;
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
      val var4: java.lang.String = this.messageId;
      val var1: java.lang.String = this.summaryId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapSummaryJumpData(channelId=");
      var2.append(var3);
      var2.append(", messageId=");
      var2.append(var4);
      var2.append(", summaryId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSummaryJumpData> {
         return TapSummaryJumpData.$serializer.INSTANCE;
      }
   }
}
