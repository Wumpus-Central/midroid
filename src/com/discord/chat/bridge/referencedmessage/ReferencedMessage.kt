package com.discord.chat.bridge.referencedmessage

import kotlinx.serialization.KSerializer
import nn.f

@f(with = ReferencedMessageSerializer::class)
public sealed class ReferencedMessage protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<ReferencedMessage> {
         return ReferencedMessageSerializer.INSTANCE;
      }
   }
}
