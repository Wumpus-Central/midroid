package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import uk.f

@f
public sealed class MentionContentNode protected constructor() : ContentNode() {
   public abstract val content: List<ContentNode>?

   @JvmStatic
   public fun `write$Self`(self: MentionContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
   }

   public companion object {
      public fun serializer(): KSerializer<MentionContentNode> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<MentionContentNode>;
      }
   }
}
