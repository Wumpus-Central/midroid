package com.discord.chat.presentation.message.view.botuikit.react

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@ub.g
internal class OnSelectComponentTapEvent : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnSelectComponentTapEvent> {
         return OnSelectComponentTapEvent.$serializer.INSTANCE;
      }
   }
}
