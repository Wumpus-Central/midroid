package com.discord.chat.bridge

import kotlinx.serialization.KSerializer
import xk.f

@f
public sealed class MessageBase protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<MessageBase> {
         return this.get$cachedSerializer();
      }
   }
}
