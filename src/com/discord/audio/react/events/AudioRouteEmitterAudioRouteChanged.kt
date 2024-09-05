package com.discord.audio.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.h
import qn.g0.a

@f
internal data class AudioRouteEmitterAudioRouteChanged(routeType: String, multipleRoutesAvailable: Boolean) : ReactEvent {
   public final val multipleRoutesAvailable: Boolean
   public final val routeType: String

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

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AudioRouteEmitterAudioRouteChanged.$serializer = new AudioRouteEmitterAudioRouteChanged.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.audio.react.events.AudioRouteEmitterAudioRouteChanged", var0, 2
         );
         var1.c("routeType", false);
         var1.c("multipleRoutesAvailable", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): AudioRouteEmitterAudioRouteChanged {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Boolean;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.C(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.C(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new AudioRouteEmitterAudioRouteChanged(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: AudioRouteEmitterAudioRouteChanged) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AudioRouteEmitterAudioRouteChanged.write$Self$audio_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AudioRouteEmitterAudioRouteChanged> {
         return AudioRouteEmitterAudioRouteChanged.$serializer.INSTANCE;
      }
   }
}
