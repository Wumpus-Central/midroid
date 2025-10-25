package com.discord.chat.bridge.botuikit

import kc.m
import kotlinx.serialization.KSerializer

@m(with = ComponentSerializer::class)
public sealed class Component protected constructor() {
   public abstract val type: Int
   public abstract val id: String

   public companion object {
      public fun serializer(): KSerializer<Component> {
         return ComponentSerializer.INSTANCE;
      }
   }
}
