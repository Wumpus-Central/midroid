package com.discord.audio.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import xu.m

@m
internal data class AudioRouteEmitterAudioRouteChanged(routeType: String, multipleRoutesAvailable: Boolean) : ReactEvent {
   public final val routeType: String
   public final val multipleRoutesAvailable: Boolean

   init {
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
      return new AudioRouteEmitterAudioRouteChanged(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioRouteEmitterAudioRouteChanged) {
         return false;
      } else {
         var1 = var1;
         if (!(this.routeType == var1.routeType)) {
            return false;
         } else {
            return this.multipleRoutesAvailable == var1.multipleRoutesAvailable;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.routeType.hashCode() * 31 + java.lang.Boolean.hashCode(this.multipleRoutesAvailable);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.routeType;
      val var1: Boolean = this.multipleRoutesAvailable;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AudioRouteEmitterAudioRouteChanged(routeType=");
      var3.append(var2);
      var3.append(", multipleRoutesAvailable=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AudioRouteEmitterAudioRouteChanged> {
         return AudioRouteEmitterAudioRouteChanged.$serializer.INSTANCE;
      }
   }
}
