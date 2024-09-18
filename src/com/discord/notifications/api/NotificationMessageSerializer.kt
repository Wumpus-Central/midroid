package com.discord.notifications.api

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.b

public object NotificationMessageSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return NotificationMessage.Companion.serializer().getDescriptor();
      }


   private final val json: Json = b.b(null, <unrepresentable>.INSTANCE, 1, null)

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
