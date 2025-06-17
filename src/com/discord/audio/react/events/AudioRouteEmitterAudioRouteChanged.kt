package com.discord.audio.react.events

import Xa.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class AudioRouteEmitterAudioRouteChanged(routeType: String, multipleRoutesAvailable: Boolean) : ReactEvent {
   public final val routeType: String
   public final val multipleRoutesAvailable: Boolean

   init {
      q.h(var1, "routeType");
      super();
      this.routeType = var1;
      this.multipleRoutesAvailable = var2;
   }

   public operator fun component1(): String {
      return this.routeType;
   }

   public operator fun component2(): Boolean {
      return this.multipleRoutesAvailable;
   }

   public fun copy(routeType: String = var0.routeType, multipleRoutesAvailable: Boolean = var0.multipleRoutesAvailable): AudioRouteEmitterAudioRouteChanged {
      q.h(var1, "routeType");
      return new AudioRouteEmitterAudioRouteChanged(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioRouteEmitterAudioRouteChanged) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.routeType, var1.routeType)) {
            return false;
         } else {
            return this.multipleRoutesAvailable == var1.multipleRoutesAvailable;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.routeType.hashCode() * 31 + java.lang.Boolean.hashCode(this.multipleRoutesAvailable);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.routeType;
      val var1: Boolean = this.multipleRoutesAvailable;
      val var2: StringBuilder = new StringBuilder();
      var2.append("AudioRouteEmitterAudioRouteChanged(routeType=");
      var2.append(var3);
      var2.append(", multipleRoutesAvailable=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AudioRouteEmitterAudioRouteChanged> {
         return AudioRouteEmitterAudioRouteChanged.$serializer.INSTANCE;
      }
   }
}
