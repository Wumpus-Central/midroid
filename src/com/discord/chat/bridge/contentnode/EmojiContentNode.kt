package com.discord.chat.bridge.contentnode

import com.discord.chat.presentation.textutils.Jumboable
import kotlinx.serialization.KSerializer
import qc.m

@m
public sealed class EmojiContentNode protected constructor() : ContentNode(), Jumboable {
   public companion object {
      public fun serializer(): KSerializer<EmojiContentNode> {
         return this.get$cachedSerializer();
      }
   }
}
