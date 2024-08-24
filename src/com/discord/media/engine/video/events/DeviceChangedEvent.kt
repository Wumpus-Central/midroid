package com.discord.media.engine.video.events

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import kotlin.jvm.internal.r

internal class DeviceChangedEvent(inputDevices: List<Map<String, Any>>, outputDevices: List<Map<String, Any>>, videoInputDevices: List<Map<String, Any>>) :
   ReactEvent {
   private final val inputDevices: List<Map<String, Any>>
   private final val outputDevices: List<Map<String, Any>>
   private final val videoInputDevices: List<Map<String, Any>>

   init {
      r.h(var1, "inputDevices");
      r.h(var2, "outputDevices");
      r.h(var3, "videoInputDevices");
      super();
      this.inputDevices = var1;
      this.outputDevices = var2;
      this.videoInputDevices = var3;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            w.a("inputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.inputDevices)),
            w.a("outputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.outputDevices)),
            w.a("videoInputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.videoInputDevices))
         }
      );
   }
}
