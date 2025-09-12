package com.discord.media.engine.video.events

import Ca.v
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap

internal class DeviceChangedEvent(inputDevices: List<Map<String, Any>>, outputDevices: List<Map<String, Any>>, videoInputDevices: List<Map<String, Any>>) :
   ReactEvent {
   private final val inputDevices: List<Map<String, Any>>
   private final val outputDevices: List<Map<String, Any>>
   private final val videoInputDevices: List<Map<String, Any>>

   init {
      this.inputDevices = var1;
      this.outputDevices = var2;
      this.videoInputDevices = var3;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         v.a("inputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.inputDevices)),
         v.a("outputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.outputDevices)),
         v.a("videoInputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.videoInputDevices))
      );
   }
}
