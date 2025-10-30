package com.discord.chat.bridge.referencedmessage

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import xp.e
import xp.h

public object ReferencedMessageSerializer : e(ReferencedMessage::class) {
   private const val STATE_LOADED: String = "0"
   private const val STATE_SYSTEM: String = "1"

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferencedMessage> {
      label20: {
         var1 = h.n(var1).get("state") as JsonElement;
         if (var1 != null) {
            val var4: JsonPrimitive = h.o(var1);
            if (var4 != null) {
               var5 = var4.b();
               break label20;
            }
         }

         var5 = null;
      }

      if (var5 == "0") {
         return LoadedReferencedMessage.Companion.serializer();
      } else if (var5 == "1") {
         return SystemReferencedMessage.Companion.serializer();
      } else {
         val var2: StringBuilder = new StringBuilder();
         var2.append("unsupported state json: ");
         var2.append(var5);
         throw new IllegalArgumentException(var2.toString());
      }
   }
}
