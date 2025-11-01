package com.discord.chat.bridge.structurabletext

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

internal object StructurableTextSerializer : bv.e(StructurableText::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<StructurableText> {
      if (var1 is JsonPrimitive) {
         return PrimitiveStructurableTextSerializer.INSTANCE;
      } else if (var1 is JsonArray) {
         return AnnotatedStructurableTextSerializer.INSTANCE;
      } else {
         val var2: StringBuilder = new StringBuilder();
         var2.append("unable to find serializer for json: ");
         var2.append(var1);
         throw new IllegalArgumentException(var2.toString());
      }
   }
}
