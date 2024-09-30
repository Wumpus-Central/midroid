package com.discord.chat.bridge.botuikit

import cl.f
import kotlinx.serialization.KSerializer

@f
public sealed class SelectComponent protected constructor() : BaseActionComponent() {
   public abstract val accessibilityLabel: String?
   public abstract val disabled: Boolean
   public abstract val maxValues: Int
   public abstract val minValues: Int
   public abstract val placeholder: String?

   public abstract fun getSelectedItems(): List<SelectItem> {
   }

   public companion object {
      public fun serializer(): KSerializer<SelectComponent> {
         return this.get$cachedSerializer();
      }
   }
}
