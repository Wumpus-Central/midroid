package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import sb.g

@g
public class NewLineContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<NewLineContentNode> {
         return NewLineContentNode.$serializer.INSTANCE;
      }
   }
}
