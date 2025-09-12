package com.discord.device.react_events

import Ca.v
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap

internal class DeviceThermalStateChangedEvent(state: Int) : ReactEvent {
   private final val state: Int

   init {
      this.state = var1;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("state", this.state)});
   }
}
