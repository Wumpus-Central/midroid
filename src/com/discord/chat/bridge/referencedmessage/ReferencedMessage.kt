package com.discord.chat.bridge.referencedmessage

import kc.m
import kotlinx.serialization.KSerializer

@m(with = ReferencedMessageSerializer::class)
public sealed class ReferencedMessage protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<ReferencedMessage> {
         return ReferencedMessageSerializer.INSTANCE;
      }
   }
}
