package com.discord.chat.reactevents

import Za.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
public class OnTapViewMoreTextData : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnTapViewMoreTextData> {
         return OnTapViewMoreTextData.$serializer.INSTANCE;
      }
   }
}
