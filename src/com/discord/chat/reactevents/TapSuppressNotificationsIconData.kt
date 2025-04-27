package com.discord.chat.reactevents

import Y9.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
public object TapSuppressNotificationsIconData : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public fun serializer(): KSerializer<TapSuppressNotificationsIconData> {
      return this.get$cachedSerializer();
   }
}
