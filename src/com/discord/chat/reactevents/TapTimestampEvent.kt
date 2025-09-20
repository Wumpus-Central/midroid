package com.discord.chat.reactevents

import A9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class TapTimestampEvent(timestamp: String) : ReactEvent {
   public final val timestamp: String

   init {
      super();
      this.timestamp = var1;
   }

   public operator fun component1(): String {
      return this.timestamp;
   }

   public fun copy(timestamp: String = var0.timestamp): TapTimestampEvent {
      return new TapTimestampEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapTimestampEvent) {
         return false;
      } else {
         return this.timestamp == (var1 as TapTimestampEvent).timestamp;
      }
   }

   public override fun hashCode(): Int {
      return this.timestamp.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("node", NativeMapExtensionsKt.nativeMapOf(s.a("full", this.timestamp))));
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.timestamp;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapTimestampEvent(timestamp=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapTimestampEvent> {
         return TapTimestampEvent.$serializer.INSTANCE;
      }
   }
}
