package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import uk.f

@f
public sealed class SelectComponent protected constructor() : BaseActionComponent() {
   public abstract val accessibilityLabel: String?
   public abstract val disabled: Boolean
   public abstract val maxValues: Int
   public abstract val minValues: Int
   public abstract val placeholder: String?

   @JvmStatic
   public fun `write$Self`(self: SelectComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
   }

   public abstract fun getSelectedItems(): List<SelectItem> {
   }

   public companion object {
      public fun serializer(): KSerializer<SelectComponent> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<SelectComponent>;
      }
   }
}
