package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kc.m
import kotlinx.serialization.KSerializer

@m
public object TapOpTagData : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public fun serializer(): KSerializer<TapOpTagData> {
      return this.get$cachedSerializer();
   }
}
