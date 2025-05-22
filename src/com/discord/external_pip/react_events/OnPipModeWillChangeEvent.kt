package com.discord.external_pip.react_events

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal class OnPipModeWillChangeEvent : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnPipModeWillChangeEvent> {
         return OnPipModeWillChangeEvent.$serializer.INSTANCE;
      }
   }
}
