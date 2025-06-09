package com.discord.media.engine.video.events

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import e9.s
import kotlin.jvm.internal.q

internal class DeviceChangedEvent(inputDevices: List<Map<String, Any>>, outputDevices: List<Map<String, Any>>, videoInputDevices: List<Map<String, Any>>) :
   ReactEvent {
   private final val inputDevices: List<Map<String, Any>>
   private final val outputDevices: List<Map<String, Any>>
   private final val videoInputDevices: List<Map<String, Any>>

   init {
      q.h(var1, "inputDevices");
      q.h(var2, "outputDevices");
      q.h(var3, "videoInputDevices");
      super();
      this.inputDevices = var1;
      this.outputDevices = var2;
      this.videoInputDevices = var3;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("inputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.inputDevices)),
         s.a("outputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.outputDevices)),
         s.a("videoInputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.videoInputDevices))
      );
   }
}
