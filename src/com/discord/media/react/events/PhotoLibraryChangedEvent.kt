package com.discord.media.react.events

import Ja.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
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
