package com.discord.audio.react.events

import B9.s
import com.discord.audio.AndroidAudioDevice
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
internal data class AudioManagerAudioDeviceChanged(device: AndroidAudioDevice) : ReactEvent {
   public final val device: AndroidAudioDevice

   init {
      r.h(var1, "device");
      super();
      this.device = var1;
   }

   public operator fun component1(): AndroidAudioDevice {
      return this.device;
   }

   public fun copy(device: AndroidAudioDevice = var0.device): AudioManagerAudioDeviceChanged {
      r.h(var1, "device");
      return new AudioManagerAudioDeviceChanged(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioManagerAudioDeviceChanged) {
         return false;
      } else {
         return r.c(this.device, (var1 as AudioManagerAudioDeviceChanged).device);
      }
   }

   public override fun hashCode(): Int {
      return this.device.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("device", this.device.toNativeMap()));
   }

   public override fun toString(): String {
      val var1: AndroidAudioDevice = this.device;
      val var2: StringBuilder = new StringBuilder();
      var2.append("AudioManagerAudioDeviceChanged(device=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AudioManagerAudioDeviceChanged> {
         return AudioManagerAudioDeviceChanged.$serializer.INSTANCE;
      }
   }
}
