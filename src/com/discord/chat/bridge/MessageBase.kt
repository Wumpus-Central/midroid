package com.discord.chat.bridge

import kotlinx.serialization.KSerializer
import sb.g

@g
public sealed class MessageBase protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<MessageBase> {
         return this.get$cachedSerializer();
      }
   }
}
