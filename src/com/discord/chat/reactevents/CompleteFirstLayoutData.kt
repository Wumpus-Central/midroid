package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap

internal class CompleteFirstLayoutData : ReactEvent {
   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
   }
}
