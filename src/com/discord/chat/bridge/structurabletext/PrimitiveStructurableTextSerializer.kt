package com.discord.chat.bridge.structurabletext

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import sc.j
import sc.e.i

internal object PrimitiveStructurableTextSerializer : KSerializer {
   public open val descriptor: SerialDescriptor = j.b("PrimitiveStructurableText", i.a)

   public open fun deserialize(decoder: Decoder): PrimitiveStructurableText {
      return new PrimitiveStructurableText(var1.z());
   }

   public open fun serialize(encoder: Encoder, value: PrimitiveStructurableText) {
      throw new UnsupportedOperationException();
   }
}
