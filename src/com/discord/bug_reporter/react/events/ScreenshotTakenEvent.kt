package com.discord.bug_reporter.react.events

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal class ScreenshotTakenEvent : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<ScreenshotTakenEvent> {
         return ScreenshotTakenEvent.$serializer.INSTANCE;
      }
   }
}
