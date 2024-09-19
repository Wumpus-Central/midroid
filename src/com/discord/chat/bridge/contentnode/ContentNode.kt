package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import xk.f

@f(with = ContentNodeSerializer::class)
public sealed class ContentNode protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<ContentNode> {
         return ContentNodeSerializer.INSTANCE;
      }
   }
}
