package com.discord.chat.bridge.messageframe

import Y9.f
import kotlinx.serialization.KSerializer

@f(with = MessageFrameSerializer::class)
public sealed class MessageFrame protected constructor() {
   public abstract val type: MessageFrameType

   public companion object {
      public fun serializer(): KSerializer<MessageFrame> {
         return MessageFrameSerializer.INSTANCE;
      }
   }
}
