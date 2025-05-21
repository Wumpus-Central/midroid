package com.discord.react_gesture_handler.passthrough_touch.events

import Ja.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
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
