package com.discord.notifications.api

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.l

public object NotificationMessageSerializer : KSerializer<NotificationMessage> {
   public open val descriptor: SerialDescriptor
      public open get() {
         return NotificationMessage.Companion.serializer().getDescriptor();
      }


   private final val json: Json = l.b(null, <unrepresentable>.INSTANCE, 1, null)

   public open fun deserialize(decoder: Decoder): NotificationMessage {
      r.h(var1, "decoder");
      return json.b(NotificationMessage.Companion.serializer(), var1.z()) as NotificationMessage;
   }

   public open fun serialize(encoder: Encoder, value: NotificationMessage) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
