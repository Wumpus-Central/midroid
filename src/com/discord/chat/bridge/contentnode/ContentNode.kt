package com.discord.chat.bridge.contentnode

import kc.m
import kotlinx.serialization.KSerializer

@m(with = ContentNodeSerializer::class)
public sealed class ContentNode protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<ContentNode> {
         return ContentNodeSerializer.INSTANCE;
      }
   }
}
