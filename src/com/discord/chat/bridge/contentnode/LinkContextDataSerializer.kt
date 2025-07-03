package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import wb.g

private object LinkContextDataSerializer : wb.d(H.b(LinkContextData.class)) {
   protected open fun selectDeserializer(element: JsonElement): KSerializer<out LinkContextData> {
      r.h(var1, "element");
      val var2: KSerializer;
      if (var1 is JsonPrimitive) {
         var2 = LinkContextData.LinkUrl.Companion.serializer();
      } else if (g.o(var1).containsKey("action")) {
         var2 = LinkContextData.LinkContext.Companion.serializer();
      } else {
         var2 = LinkContextData.BindDoNothing.INSTANCE.serializer();
      }

      return var2;
   }
}
