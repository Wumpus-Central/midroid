package com.discord.chat.bridge.contentnode

import ga.d
import ga.g
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

private object LinkContextDataSerializer : d(E.b(LinkContextData.class)) {
   protected open fun selectDeserializer(element: JsonElement): KSerializer<out LinkContextData> {
      q.h(var1, "element");
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
