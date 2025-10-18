package com.discord.audio.react.events

import Da.v
import com.discord.audio.AndroidAudioDevice
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlinx.serialization.KSerializer
import qc.m

@m
internal data class AudioManagerAudioDeviceChanged(device: AndroidAudioDevice) : ReactEvent {
   public final val device: AndroidAudioDevice

   init {
      super();
      this.device = var1;
   }

   public operator fun component1(): AndroidAudioDevice {
      return this.device;
   }

   public fun copy(device: AndroidAudioDevice = var0.device): AudioManagerAudioDeviceChanged {
      return new AudioManagerAudioDeviceChanged(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioManagerAudioDeviceChanged) {
         return false;
      } else {
         return this.device == (var1 as AudioManagerAudioDeviceChanged).device;
      }
   }

   public override fun hashCode(): Int {
      return this.device.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("device", this.device.toNativeMap())});
   }

   public override fun toString(): String {
      val var2: AndroidAudioDevice = this.device;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AudioManagerAudioDeviceChanged(device=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AudioManagerAudioDeviceChanged> {
         return AudioManagerAudioDeviceChanged.$serializer.INSTANCE;
      }
   }
}
