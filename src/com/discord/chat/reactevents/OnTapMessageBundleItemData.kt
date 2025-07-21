package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import sb.g

@g
public class OnTapMessageBundleItemData : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnTapMessageBundleItemData> {
         return OnTapMessageBundleItemData.$serializer.INSTANCE;
      }
   }
}
