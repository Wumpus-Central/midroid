package com.discord.chat.bridge

import kc.m
import kotlinx.serialization.KSerializer

@m
public sealed class MessageBase protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<MessageBase> {
         return this.get$cachedSerializer();
      }
   }
}
