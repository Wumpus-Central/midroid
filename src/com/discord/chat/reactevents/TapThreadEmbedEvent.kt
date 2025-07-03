package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class TapThreadEmbedEvent(messageId: String) : ReactEvent {
   public final val messageId: String

   init {
      r.h(var1, "messageId");
      super();
      this.messageId = var1;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public fun copy(messageId: String = var0.messageId): TapThreadEmbedEvent {
      r.h(var1, "messageId");
      return new TapThreadEmbedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapThreadEmbedEvent) {
         return false;
      } else {
         return r.c(this.messageId, (var1 as TapThreadEmbedEvent).messageId);
      }
   }

   public override fun hashCode(): Int {
      return this.messageId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.messageId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapThreadEmbedEvent(messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapThreadEmbedEvent> {
         return TapThreadEmbedEvent.$serializer.INSTANCE;
      }
   }
}
