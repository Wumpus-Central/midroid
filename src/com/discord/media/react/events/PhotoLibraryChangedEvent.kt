package com.discord.media.react.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.f

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
