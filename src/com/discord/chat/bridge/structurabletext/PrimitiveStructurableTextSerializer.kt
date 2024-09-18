package com.discord.chat.bridge.structurabletext

import al.g
import al.e.i
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

internal object PrimitiveStructurableTextSerializer : KSerializer {
   public open val descriptor: SerialDescriptor = g.a("PrimitiveStructurableText", i.a)

   public open fun deserialize(decoder: Decoder): PrimitiveStructurableText {
      q.h(var1, "decoder");
      return new PrimitiveStructurableText(var1.n());
   }

   public open fun serialize(encoder: Encoder, value: PrimitiveStructurableText) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
