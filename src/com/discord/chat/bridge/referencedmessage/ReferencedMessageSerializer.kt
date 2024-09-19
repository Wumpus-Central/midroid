package com.discord.chat.bridge.referencedmessage

import jl.d
import jl.g
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

public object ReferencedMessageSerializer : d(g0.b(ReferencedMessage.class)) {
   private const val STATE_LOADED: String = "0"
   private const val STATE_SYSTEM: String = "1"

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferencedMessage> {
      label21: {
         q.h(var1, "element");
         var1 = g.o(var1).get("state") as JsonElement;
         if (var1 != null) {
            val var4: JsonPrimitive = g.p(var1);
            if (var4 != null) {
               var5 = var4.a();
               break label21;
            }
         }

         var5 = null;
      }

      val var6: KSerializer;
      if (q.c(var5, "0")) {
         var6 = LoadedReferencedMessage.Companion.serializer();
      } else {
         if (!q.c(var5, "1")) {
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
