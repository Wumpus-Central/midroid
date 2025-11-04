package com.discord.audio.react.events

import com.discord.audio.AndroidAudioDevice
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableNativeMap
import ht.v
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

internal data class AudioManagerAudioDevicesUpdated(devices: List<AndroidAudioDevice>) : ReactEvent {
   public final val devices: List<AndroidAudioDevice>

   init {
      this.devices = var1;
   }

   public operator fun component1(): List<AndroidAudioDevice> {
      return this.devices;
   }

   public fun copy(devices: List<AndroidAudioDevice> = var0.devices): AudioManagerAudioDevicesUpdated {
      return new AudioManagerAudioDevicesUpdated(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioManagerAudioDevicesUpdated) {
         return false;
      } else {
         return this.devices == (var1 as AudioManagerAudioDevicesUpdated).devices;
      }
   }

   public override fun hashCode(): Int {
      return this.devices.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{v.a("devices", AudioManagerAudioDevicesUpdated.Companion.access$convertDevices(Companion, this.devices))}
      );
   }

   public override fun toString(): String {
      val var2: java.util.List = this.devices;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AudioManagerAudioDevicesUpdated(devices=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   @SourceDebugExtension(["SMAP\nAudioManagerAudioDevicesUpdated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioManagerAudioDevicesUpdated.kt\ncom/discord/audio/react/events/AudioManagerAudioDevicesUpdated$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1557#2:24\n1628#2,3:25\n*S KotlinDebug\n*F\n+ 1 AudioManagerAudioDevicesUpdated.kt\ncom/discord/audio/react/events/AudioManagerAudioDevicesUpdated$Companion\n*L\n19#1:24\n19#1:25,3\n*E\n"])
   public companion object {
      private fun convertDevices(devices: List<AndroidAudioDevice>): ReadableNativeArray {
         val var3: ArrayList = new ArrayList(CollectionsKt.w(var1, 10));
         val var4: java.util.Iterator = var1.iterator();

         while (var4.hasNext()) {
            var3.add((var4.next() as AndroidAudioDevice).toNativeMap());
         }

         return NativeArrayExtensionsKt.toNativeArray$default(var3, null, 1, null);
      }
   }
}
