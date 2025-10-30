package com.discord.lifecycle.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
internal class OnHostDestroyEvent : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnHostDestroyEvent> {
         return OnHostDestroyEvent.$serializer.INSTANCE;
      }
   }
}
