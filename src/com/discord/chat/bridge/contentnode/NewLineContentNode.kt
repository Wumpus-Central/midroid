package com.discord.chat.bridge.contentnode

import kb.f
import kotlinx.serialization.KSerializer

@f
public class NewLineContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<NewLineContentNode> {
         return NewLineContentNode.$serializer.INSTANCE;
      }
   }
}
