package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import uk.f

@f
public sealed class SearchableSelectComponent protected constructor() : SelectComponent() {
   public abstract val selectedOptions: List<SearchableSelectItem>

   @JvmStatic
   public fun `write$Self`(self: SearchableSelectComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      SelectComponent.write$Self(var0, var1, var2);
   }

   public override fun getSelectedItems(): List<SearchableSelectItem> {
      return this.getSelectedOptions();
   }

   public companion object {
      public fun serializer(): KSerializer<SearchableSelectComponent> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<SearchableSelectComponent>;
      }
   }
}
