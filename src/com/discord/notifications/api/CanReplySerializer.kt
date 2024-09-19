package com.discord.notifications.api

import gl.a
import kotlin.jvm.internal.c
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CanReplySerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return a.w(c.a).getDescriptor();
      }


   public open fun deserialize(decoder: Decoder): Boolean {
      q.h(var1, "decoder");
      return q.c(var1.n(), "can_reply");
   }

   public open fun serialize(encoder: Encoder, value: Boolean) {
      q.h(var1, "encoder");
      throw new UnsupportedOperationException();
   }
}
