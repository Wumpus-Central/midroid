package com.discord.lifecycle.react.events

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal class OnHostDestroyEvent : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnHostDestroyEvent> {
         return OnHostDestroyEvent.$serializer.INSTANCE;
      }
   }
}
