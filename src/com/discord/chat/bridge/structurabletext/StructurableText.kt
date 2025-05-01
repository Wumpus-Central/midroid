package com.discord.chat.bridge.structurabletext

import Y9.f
import kotlinx.serialization.KSerializer

@f(with = StructurableTextSerializer::class)
public sealed class StructurableText protected constructor() {
   public abstract val hasContent: Boolean

   public companion object {
      public fun serializer(): KSerializer<StructurableText> {
         return StructurableTextSerializer.INSTANCE;
      }
   }
}
