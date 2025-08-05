package com.discord.chat.input.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlinx.serialization.KSerializer
import ub.g

@g
internal class OnRequestSendEvent : ReactEvent {
   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf();
   }

   public companion object {
      public fun serializer(): KSerializer<OnRequestSendEvent> {
         return OnRequestSendEvent.$serializer.INSTANCE;
      }
   }
}
