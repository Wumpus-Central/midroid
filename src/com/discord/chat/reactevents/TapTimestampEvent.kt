package com.discord.chat.reactevents

import Ja.v
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import wc.m

@m
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

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("node", NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("full", this.timestamp)}))});
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
