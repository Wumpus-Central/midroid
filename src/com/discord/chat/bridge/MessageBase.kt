package com.discord.chat.bridge

import cl.f
import kotlinx.serialization.KSerializer

@f
public sealed class MessageBase protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<MessageBase> {
         return this.get$cachedSerializer();
      }
   }
}
