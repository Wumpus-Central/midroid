package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import vk.f

@f
public object TapOpTagData : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public fun serializer(): KSerializer<TapOpTagData> {
      return this.get$cachedSerializer();
   }
}
