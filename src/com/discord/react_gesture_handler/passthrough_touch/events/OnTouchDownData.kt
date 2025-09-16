package com.discord.react_gesture_handler.passthrough_touch.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public class OnTouchDownData : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnTouchDownData> {
         return OnTouchDownData.$serializer.INSTANCE;
      }
   }
}
