package com.discord.chat.bridge.referencedmessage

import cl.f
import kotlinx.serialization.KSerializer

@f(with = ReferencedMessageSerializer::class)
public sealed class ReferencedMessage protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<ReferencedMessage> {
         return ReferencedMessageSerializer.INSTANCE;
      }
   }
}
