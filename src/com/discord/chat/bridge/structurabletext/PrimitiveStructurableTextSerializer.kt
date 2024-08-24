package com.discord.chat.bridge.structurabletext

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import wk.g
import wk.e.i

internal object PrimitiveStructurableTextSerializer : KSerializer<PrimitiveStructurableText> {
   public open val descriptor: SerialDescriptor = g.a("PrimitiveStructurableText", i.a)

   public open fun deserialize(decoder: Decoder): PrimitiveStructurableText {
      r.h(var1, "decoder");
      return new PrimitiveStructurableText(var1.z());
   }

   public open fun serialize(encoder: Encoder, value: PrimitiveStructurableText) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
