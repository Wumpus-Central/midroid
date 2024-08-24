package com.discord.chat.bridge.contentnode

import com.discord.chat.presentation.textutils.Jumboable
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import uk.f

@f
public sealed class EmojiContentNode protected constructor() : ContentNode(), Jumboable {
   @JvmStatic
   public fun `write$Self`(self: EmojiContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
   }

   public companion object {
      public fun serializer(): KSerializer<EmojiContentNode> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<EmojiContentNode>;
      }
   }
}
