package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import pc.m

@m
public object TapOpTagData : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public fun serializer(): KSerializer<TapOpTagData> {
      return this.get$cachedSerializer();
   }
}
