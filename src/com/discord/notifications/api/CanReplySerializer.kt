package com.discord.notifications.api

import kotlin.jvm.internal.c
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import ub.a

public object CanReplySerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return a.A(c.a).getDescriptor();
      }


   public open fun deserialize(decoder: Decoder): Boolean {
      r.h(var1, "decoder");
      return r.c(var1.n(), "can_reply");
   }

   public open fun serialize(encoder: Encoder, value: Boolean) {
      r.h(var1, "encoder");
      throw new UnsupportedOperationException();
   }
}
