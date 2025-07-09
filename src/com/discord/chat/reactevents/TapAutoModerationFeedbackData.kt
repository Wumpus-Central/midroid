package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@f
public data class TapAutoModerationFeedbackData(messageId: String, channelId: String) : ReactEvent {
   public final val messageId: String
   public final val channelId: String

   init {
      r.h(var1, "messageId");
      r.h(var2, "channelId");
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
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      return new TapAutoModerationFeedbackData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAutoModerationFeedbackData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.channelId, var1.channelId);
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
      val var2: java.lang.String = this.messageId;
      val var1: java.lang.String = this.channelId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapAutoModerationFeedbackData(messageId=");
      var3.append(var2);
      var3.append(", channelId=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAutoModerationFeedbackData> {
         return TapAutoModerationFeedbackData.$serializer.INSTANCE;
      }
   }
}
