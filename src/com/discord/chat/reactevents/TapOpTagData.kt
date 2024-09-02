package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import kotlinx.serialization.KSerializer

@f
public object TapOpTagData : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public fun serializer(): KSerializer<TapOpTagData> {
      return this.get$cachedSerializer();
   }
}
