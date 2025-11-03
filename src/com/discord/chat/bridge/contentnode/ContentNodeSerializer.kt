package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

public object ContentNodeSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return zu.j.b("ContentNode", zu.e.i.a);
      }


   public open fun deserialize(decoder: Decoder): ContentNode {
      try {
         if (var1 is bv.f) {
            val var2: JsonElement = (var1 as bv.f).g();
            return (ContentNode)(if (var2 is JsonPrimitive)
               new TextContentNode((var2 as JsonPrimitive).b())
               else
               (var1 as bv.f).d().d(ContentNodeKt.access$getSealedClassSerializer$p(), var2) as ContentNode);
         } else {
            throw new IllegalArgumentException("Failed requirement.");
         }
      } catch (var3: Exception) {
         return new ErrorContentNode(var3);
      }
   }

   public open fun serialize(encoder: Encoder, value: ContentNode) {
      throw new UnsupportedOperationException();
   }
}
