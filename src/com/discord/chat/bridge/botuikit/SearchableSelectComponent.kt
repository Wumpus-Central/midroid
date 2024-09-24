package com.discord.chat.bridge.botuikit

import cl.f
import kotlinx.serialization.KSerializer

@f
public sealed class SearchableSelectComponent protected constructor() : SelectComponent() {
   public abstract val selectedOptions: List<SearchableSelectItem>

   public override fun getSelectedItems(): List<SearchableSelectItem> {
      return this.getSelectedOptions();
   }

   public companion object {
      public fun serializer(): KSerializer<SearchableSelectComponent> {
         return this.get$cachedSerializer();
      }
   }
}
