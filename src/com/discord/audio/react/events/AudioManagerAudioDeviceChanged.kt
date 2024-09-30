package com.discord.audio.react.events

import cl.f
import cl.n
import com.discord.audio.AndroidAudioDevice
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import fl.g0
import fl.g0.a
import kh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class AudioManagerAudioDeviceChanged(device: AndroidAudioDevice) : ReactEvent {
   public final val device: AndroidAudioDevice

   init {
      q.h(var1, "device");
      super();
      this.device = var1;
   }

   public operator fun component1(): AndroidAudioDevice {
      return this.device;
   }

   public fun copy(device: AndroidAudioDevice = var0.device): AudioManagerAudioDeviceChanged {
      q.h(var1, "device");
      return new AudioManagerAudioDeviceChanged(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioManagerAudioDeviceChanged) {
         return false;
      } else {
         return q.c(this.device, (var1 as AudioManagerAudioDeviceChanged).device);
      }
   }

   public override fun hashCode(): Int {
      return this.device.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("device", this.device.toNativeMap()));
   }

   public override fun toString(): String {
      val var2: AndroidAudioDevice = this.device;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AudioManagerAudioDeviceChanged(device=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AudioManagerAudioDeviceChanged.$serializer = new AudioManagerAudioDeviceChanged.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.audio.react.events.AudioManagerAudioDeviceChanged", var0, 1
         );
         var1.l("device", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{AndroidAudioDevice.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): AudioManagerAudioDeviceChanged {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: AndroidAudioDevice;
         if (var5) {
            var8 = var7.m(var6, 0, AndroidAudioDevice.$serializer.INSTANCE, null) as AndroidAudioDevice;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0, AndroidAudioDevice.$serializer.INSTANCE, var8) as AndroidAudioDevice;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new AudioManagerAudioDeviceChanged(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: AudioManagerAudioDeviceChanged) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AudioManagerAudioDeviceChanged.write$Self$audio_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AudioManagerAudioDeviceChanged> {
         return AudioManagerAudioDeviceChanged.$serializer.INSTANCE;
      }
   }
}
