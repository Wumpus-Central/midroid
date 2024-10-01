package com.discord.device.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import nh.w

internal class DeviceThermalStateChangedEvent(state: Int) : ReactEvent {
   private final val state: Int

   init {
      this.state = var1;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("state", this.state));
   }
}
