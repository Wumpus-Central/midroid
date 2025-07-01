package com.discord.notifications.api

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.json.b

public object NotificationMessageSerializer : KSerializer {
   private final val json: Json = b.b(null, new U1.b(), 1, null)

   public open val descriptor: SerialDescriptor
      public open get() {
         return NotificationMessage.Companion.serializer().getDescriptor();
      }


   @JvmStatic
   fun `json$lambda$0`(var0: JsonBuilder): Unit {
      q.h(var0, "$this$Json");
      var0.c(true);
      return Unit.a;
   }

   public open fun deserialize(decoder: Decoder): NotificationMessage {
      q.h(var1, "decoder");
      return json.b(NotificationMessage.Companion.serializer(), var1.n()) as NotificationMessage;
   }

   public open fun serialize(encoder: Encoder, value: NotificationMessage) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
