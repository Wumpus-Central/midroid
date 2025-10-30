package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import xp.e
import xp.h

private object LinkContextDataSerializer : e(LinkContextData::class) {
   protected open fun selectDeserializer(element: JsonElement): KSerializer<out LinkContextData> {
      if (var1 is JsonPrimitive) {
         return LinkContextData.LinkUrl.Companion.serializer();
      } else {
         return if (h.n(var1).containsKey("action"))
            LinkContextData.LinkContext.Companion.serializer()
            else
            LinkContextData.BindDoNothing.INSTANCE.serializer();
      }
   }
}
