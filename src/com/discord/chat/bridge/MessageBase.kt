package com.discord.chat.bridge

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import uk.f

@f
public sealed class MessageBase protected constructor() {
   @JvmStatic
   public fun `write$Self`(self: MessageBase, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
   }

   public companion object {
      public fun serializer(): KSerializer<MessageBase> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<MessageBase>;
      }
   }
}
