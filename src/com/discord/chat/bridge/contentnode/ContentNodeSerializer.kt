package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.e
import wk.g
import wk.e.i

public object ContentNodeSerializer : KSerializer<ContentNode> {
   public open val descriptor: SerialDescriptor
      public open get() {
         return g.a("ContentNode", i.a);
      }


   public open fun deserialize(decoder: Decoder): ContentNode {
      r.h(var1, "decoder");

      try {
         if (var1 !is e) {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }

         val var2: JsonElement = (var1 as e).g();
         if (var2 is JsonPrimitive) {
            var4 = new TextContentNode((var2 as JsonPrimitive).j());
         } else {
            var4 = (var1 as e).d().d(ContentNodeKt.access$getSealedClassSerializer$p(), var2) as ContentNode;
         }
      } catch (var3: Exception) {
         var4 = new ErrorContentNode(var3);
      }

      return (ContentNode)var4;
   }

   public open fun serialize(encoder: Encoder, value: ContentNode) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
