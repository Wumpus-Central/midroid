package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import xk.f

@f
public sealed class MentionContentNode protected constructor() : ContentNode() {
   public abstract val content: List<ContentNode>?

   public companion object {
      public fun serializer(): KSerializer<MentionContentNode> {
         return this.get$cachedSerializer();
      }
   }
}
