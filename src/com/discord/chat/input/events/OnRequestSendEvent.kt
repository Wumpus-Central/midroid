package com.discord.chat.input.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kc.m
import kotlinx.serialization.KSerializer

@m
internal class OnRequestSendEvent : ReactEvent {
   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
   }

   public companion object {
      public fun serializer(): KSerializer<OnRequestSendEvent> {
         return OnRequestSendEvent.$serializer.INSTANCE;
      }
   }
}
