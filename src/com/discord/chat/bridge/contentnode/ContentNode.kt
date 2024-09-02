package com.discord.chat.bridge.contentnode

import dn.f
import kotlinx.serialization.KSerializer

@f(with = ContentNodeSerializer::class)
public sealed class ContentNode protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<ContentNode> {
         return ContentNodeSerializer.INSTANCE;
      }
   }
}
