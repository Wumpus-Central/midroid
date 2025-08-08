package com.discord.chat.presentation.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class TapReactionOverflow(messageId: String, channelId: String) : ReactEvent {
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

   public fun copy(messageId: String = var0.messageId, channelId: String = var0.channelId): TapReactionOverflow {
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      return new TapReactionOverflow(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapReactionOverflow) {
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
      val var3: java.lang.String = this.channelId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapReactionOverflow(messageId=");
      var1.append(var2);
      var1.append(", channelId=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapReactionOverflow> {
         return TapReactionOverflow.$serializer.INSTANCE;
      }
   }
}
