package com.discord.media.engine.video.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import t9.s

internal data class AudioInputInitializedEvent(timeToInitialized: Double, description: Map<String, Any>) : ReactEvent {
   public final val timeToInitialized: Double
   public final val description: Map<String, Any>

   init {
      q.h(var3, "description");
      super();
      this.timeToInitialized = var1;
      this.description = var3;
   }

   public operator fun component1(): Double {
      return this.timeToInitialized;
   }

   public operator fun component2(): Map<String, Any> {
      return this.description;
   }

   public fun copy(timeToInitialized: Double = var0.timeToInitialized, description: Map<String, Any> = var0.description): AudioInputInitializedEvent {
      q.h(var3, "description");
      return new AudioInputInitializedEvent(var1, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioInputInitializedEvent) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.timeToInitialized, var1.timeToInitialized) != 0) {
            return false;
         } else {
            return q.c(this.description, var1.description);
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Double.hashCode(this.timeToInitialized) * 31 + this.description.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("timeToInitialized", this.timeToInitialized), s.a("description", NativeMapExtensionsKt.toNativeMap(this.description))
      );
   }

   public override fun toString(): String {
      val var1: Double = this.timeToInitialized;
      val var3: java.util.Map = this.description;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AudioInputInitializedEvent(timeToInitialized=");
      var4.append(var1);
      var4.append(", description=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }
}
