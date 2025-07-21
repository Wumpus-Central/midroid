package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f
import z9.s

@f
public data class TapTimestampEvent(timestamp: String) : ReactEvent {
   public final val timestamp: String

   init {
      r.h(var1, "timestamp");
      super();
      this.timestamp = var1;
   }

   public operator fun component1(): String {
      return this.timestamp;
   }

   public fun copy(timestamp: String = var0.timestamp): TapTimestampEvent {
      r.h(var1, "timestamp");
      return new TapTimestampEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapTimestampEvent) {
         return false;
      } else {
         return r.c(this.timestamp, (var1 as TapTimestampEvent).timestamp);
      }
   }

   public override fun hashCode(): Int {
      return this.timestamp.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("node", NativeMapExtensionsKt.nativeMapOf(s.a("full", this.timestamp))));
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.timestamp;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapTimestampEvent(timestamp=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapTimestampEvent> {
         return TapTimestampEvent.$serializer.INSTANCE;
      }
   }
}
