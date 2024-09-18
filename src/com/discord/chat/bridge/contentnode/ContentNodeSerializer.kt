package com.discord.chat.bridge.contentnode

import al.g
import al.e.i
import cl.e
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

public object ContentNodeSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return g.a("ContentNode", i.a);
      }


   public open fun deserialize(decoder: Decoder): ContentNode {
      q.h(var1, "decoder");

      try {
         if (var1 !is e) {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }

         val var2: JsonElement = (var1 as e).i();
         if (var2 is JsonPrimitive) {
            var4 = new TextContentNode((var2 as JsonPrimitive).a());
         } else {
            var4 = (var1 as e).d().d(ContentNodeKt.access$getSealedClassSerializer$p(), var2) as ContentNode;
         }
      } catch (var3: Exception) {
         var4 = new ErrorContentNode(var3);
      }

      return (ContentNode)var4;
   }

   public open fun serialize(encoder: Encoder, value: ContentNode) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
