package com.discord.media.engine.video.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlinx.serialization.KSerializer
import xu.m

@m
internal class OnReadyEvent : ReactEvent {
   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf();
   }

   public companion object {
      public fun serializer(): KSerializer<OnReadyEvent> {
         return OnReadyEvent.$serializer.INSTANCE;
      }
   }
}
