package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import wc.m

@m
public sealed class SelectComponent protected constructor() : BaseActionComponent() {
   public abstract val placeholder: String?
   public abstract val accessibilityLabel: String?
   public abstract val minValues: Int
   public abstract val maxValues: Int
   public abstract val disabled: Boolean

   public abstract fun getSelectedItems(): List<SelectItem> {
   }

   public companion object {
      public fun serializer(): KSerializer<SelectComponent> {
         return this.get$cachedSerializer();
      }
   }
}
