package com.discord.chat.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
public class OnLongPressMessageBundleItemData : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<OnLongPressMessageBundleItemData> {
         return OnLongPressMessageBundleItemData.$serializer.INSTANCE;
      }
   }
}
