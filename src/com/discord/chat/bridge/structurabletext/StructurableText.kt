package com.discord.chat.bridge.structurabletext

import kotlinx.serialization.KSerializer
import yk.f

@f(with = StructurableTextSerializer::class)
public sealed class StructurableText protected constructor() {
   public abstract val hasContent: Boolean

   public companion object {
      public fun serializer(): KSerializer<StructurableText> {
         return StructurableTextSerializer.INSTANCE;
      }
   }
}
