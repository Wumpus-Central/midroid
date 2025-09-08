package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import mb.g

@g
public sealed class SelectItem protected constructor() {
   public abstract val label: String
   public abstract val value: String

   public companion object {
      public fun serializer(): KSerializer<SelectItem> {
         return this.get$cachedSerializer();
      }
   }
}
