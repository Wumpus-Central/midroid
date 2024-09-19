package com.discord.chat.bridge.structurabletext

import bl.d
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

internal object StructurableTextSerializer : d(g0.b(StructurableText.class)) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<StructurableText> {
      q.h(var1, "element");
      val var3: Any;
      if (var1 is JsonPrimitive) {
         var3 = PrimitiveStructurableTextSerializer.INSTANCE;
      } else {
         if (var1 !is JsonArray) {
            val var2: StringBuilder = new StringBuilder();
            var2.append("unable to find serializer for json: ");
            var2.append(var1);
            throw new IllegalArgumentException(var2.toString());
         }

         var3 = AnnotatedStructurableTextSerializer.INSTANCE;
      }

      return (DeserializationStrategy)var3;
   }
}
