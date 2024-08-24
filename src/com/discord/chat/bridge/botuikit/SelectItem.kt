package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import uk.f

@f
public sealed class SelectItem protected constructor() {
   public abstract val label: String
   public abstract val value: String

   @JvmStatic
   public fun `write$Self`(self: SelectItem, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
   }

   public companion object {
      public fun serializer(): KSerializer<SelectItem> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<SelectItem>;
      }
   }
}
