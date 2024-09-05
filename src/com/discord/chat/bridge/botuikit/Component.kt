package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import nn.f

@f(with = ComponentSerializer::class)
public sealed class Component protected constructor() {
   public abstract val id: String
   public abstract val type: Int

   public companion object {
      public fun serializer(): KSerializer<Component> {
         return ComponentSerializer.INSTANCE;
      }
   }
}
