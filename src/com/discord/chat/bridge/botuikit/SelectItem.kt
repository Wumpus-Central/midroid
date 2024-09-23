package com.discord.chat.bridge.botuikit

import fl.f
import kotlinx.serialization.KSerializer

@f
public sealed class SelectItem protected constructor() {
   public abstract val label: String
   public abstract val value: String

   public companion object {
      public fun serializer(): KSerializer<SelectItem> {
         return this.get$cachedSerializer();
      }
   }
}
