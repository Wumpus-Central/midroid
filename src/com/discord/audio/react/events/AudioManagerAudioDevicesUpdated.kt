package com.discord.audio.react.events

import ch.w
import com.discord.audio.AndroidAudioDevice
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableNativeMap
import java.util.ArrayList
import kotlin.jvm.internal.q

internal data class AudioManagerAudioDevicesUpdated(devices: List<AndroidAudioDevice>) : ReactEvent {
   public final val devices: List<AndroidAudioDevice>

   init {
      q.h(var1, "devices");
      super();
      this.devices = var1;
   }

   public operator fun component1(): List<AndroidAudioDevice> {
      return this.devices;
   }

   public fun copy(devices: List<AndroidAudioDevice> = var0.devices): AudioManagerAudioDevicesUpdated {
      q.h(var1, "devices");
      return new AudioManagerAudioDevicesUpdated(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioManagerAudioDevicesUpdated) {
         return false;
      } else {
         return q.c(this.devices, (var1 as AudioManagerAudioDevicesUpdated).devices);
      }
   }

   public override fun hashCode(): Int {
      return this.devices.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("devices", AudioManagerAudioDevicesUpdated.Companion.access$convertDevices(Companion, this.devices)));
   }

   public override fun toString(): String {
      val var2: java.util.List = this.devices;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AudioManagerAudioDevicesUpdated(devices=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      private fun convertDevices(devices: List<AndroidAudioDevice>): ReadableNativeArray {
         val var2: ArrayList = new ArrayList(i.u(var1, 10));
         val var3: java.util.Iterator = var1.iterator();

         while (var3.hasNext()) {
            var2.add((var3.next() as AndroidAudioDevice).toNativeMap());
         }

         return NativeArrayExtensionsKt.toNativeArray(var2);
      }
   }
}
