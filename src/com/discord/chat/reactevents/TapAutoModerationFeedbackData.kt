package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class TapAutoModerationFeedbackData(messageId: String, channelId: String) : ReactEvent {
   public final val messageId: String
   public final val channelId: String

   init {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      super();
      this.messageId = var1;
      this.channelId = var2;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public fun copy(messageId: String = var0.messageId, channelId: String = var0.channelId): TapAutoModerationFeedbackData {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      return new TapAutoModerationFeedbackData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAutoModerationFeedbackData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.messageId.hashCode() * 31 + this.channelId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.messageId;
      val var3: java.lang.String = this.channelId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapAutoModerationFeedbackData(messageId=");
      var2.append(var1);
      var2.append(", channelId=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAutoModerationFeedbackData> {
         return TapAutoModerationFeedbackData.$serializer.INSTANCE;
      }
   }
}
