package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import mc.j
import mc.e.i
import oc.f

public object ContentNodeSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return j.b("ContentNode", i.a);
      }


   public open fun deserialize(decoder: Decoder): ContentNode {
      try {
         if (var1 !is f) {
            throw new IllegalArgumentException("Failed requirement.");
         }

         val var2: JsonElement = (var1 as f).g();
         if (var2 is JsonPrimitive) {
            var4 = new TextContentNode((var2 as JsonPrimitive).c());
         } else {
            var4 = (var1 as f).d().d(ContentNodeKt.access$getSealedClassSerializer$p(), var2) as ContentNode;
         }
      } catch (var3: Exception) {
         var4 = new ErrorContentNode(var3);
      }

      return (ContentNode)var4;
   }

   public open fun serialize(encoder: Encoder, value: ContentNode) {
      throw new UnsupportedOperationException();
   }
}
