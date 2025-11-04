package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kc.m
import kotlinx.serialization.KSerializer

@m
public class OnTapViewMoreTextData : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnTapViewMoreTextData> {
         return OnTapViewMoreTextData.$serializer.INSTANCE;
      }
   }
}
