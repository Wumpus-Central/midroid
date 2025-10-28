package com.discord.chat.bridge.contentnode

import Ac.e
import Ac.h
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

private object LinkContextDataSerializer : e(LinkContextData::class) {
   protected open fun selectDeserializer(element: JsonElement): KSerializer<out LinkContextData> {
      val var2: KSerializer;
      if (var1 is JsonPrimitive) {
         var2 = LinkContextData.LinkUrl.Companion.serializer();
      } else if (h.n(var1).containsKey("action")) {
         var2 = LinkContextData.LinkContext.Companion.serializer();
      } else {
         var2 = LinkContextData.BindDoNothing.INSTANCE.serializer();
      }

      return var2;
   }
}
