package com.discord.notifications.api

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.json.b

public object NotificationMessageSerializer : KSerializer {
   private final val json: Json = b.b(null, new Z2.b(), 1, null)

   public open val descriptor: SerialDescriptor
      public open get() {
         return NotificationMessage.Companion.serializer().getDescriptor();
      }


   @JvmStatic
   fun `json$lambda$0`(var0: JsonBuilder): Unit {
      var0.c(true);
      return Unit.a;
   }

   public open fun deserialize(decoder: Decoder): NotificationMessage {
      return json.b(NotificationMessage.Companion.serializer(), var1.z()) as NotificationMessage;
   }

   public open fun serialize(encoder: Encoder, value: NotificationMessage) {
      throw new UnsupportedOperationException();
   }
}
