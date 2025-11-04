package com.discord.media.react.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kc.m
import kotlinx.serialization.KSerializer

@m
internal class PhotoLibraryChangedEvent : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<PhotoLibraryChangedEvent> {
         return PhotoLibraryChangedEvent.$serializer.INSTANCE;
      }
   }
}
