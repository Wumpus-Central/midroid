package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import tb.g

@g(with = ContentNodeSerializer::class)
public sealed class ContentNode protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<ContentNode> {
         return ContentNodeSerializer.INSTANCE;
      }
   }
}
