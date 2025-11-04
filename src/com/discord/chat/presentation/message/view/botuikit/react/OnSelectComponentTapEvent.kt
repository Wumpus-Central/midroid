package com.discord.chat.presentation.message.view.botuikit.react

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@kc.m
internal class OnSelectComponentTapEvent : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnSelectComponentTapEvent> {
         return OnSelectComponentTapEvent.$serializer.INSTANCE;
      }
   }
}
