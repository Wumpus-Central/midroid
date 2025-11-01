package com.discord.bug_reporter.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import xu.m

@m
internal class ScreenshotTakenEvent : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<ScreenshotTakenEvent> {
         return ScreenshotTakenEvent.$serializer.INSTANCE;
      }
   }
}
