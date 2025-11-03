package com.discord.device.react_events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import ht.v

internal class DeviceThermalStateChangedEvent(state: Int) : ReactEvent {
   private final val state: Int

   init {
      this.state = var1;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(v.a("state", this.state));
   }
}
