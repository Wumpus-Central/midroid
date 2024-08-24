package com.discord.chat.bridge.referencedmessage

import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.d
import kotlinx.serialization.json.g

public object ReferencedMessageSerializer : d(h0.b(ReferencedMessage.class)) {
   private const val STATE_LOADED: String = "0"
   private const val STATE_SYSTEM: String = "1"

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferencedMessage> {
      label21: {
         r.h(var1, "element");
         var1 = g.o(var1).get("state") as JsonElement;
         if (var1 != null) {
            val var4: JsonPrimitive = g.p(var1);
            if (var4 != null) {
               var5 = var4.e();
               break label21;
            }
         }

         var5 = null;
      }

      val var6: KSerializer;
      if (r.c(var5, "0")) {
         var6 = LoadedReferencedMessage.Companion.serializer();
      } else {
         if (!r.c(var5, "1")) {
            val var2: StringBuilder = new StringBuilder();
            var2.append("unsupported state json: ");
            var2.append(var5);
            throw new IllegalArgumentException(var2.toString());
         }

         var6 = SystemReferencedMessage.Companion.serializer();
      }

      return var6;
   }
}
