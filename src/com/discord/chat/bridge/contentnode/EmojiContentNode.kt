package com.discord.chat.bridge.contentnode

import com.discord.chat.presentation.textutils.Jumboable
import kotlinx.serialization.KSerializer
import vk.f

@f
public sealed class EmojiContentNode protected constructor() : ContentNode(), Jumboable {
   public companion object {
      public fun serializer(): KSerializer<EmojiContentNode> {
         return this.get$cachedSerializer();
      }
   }
}
