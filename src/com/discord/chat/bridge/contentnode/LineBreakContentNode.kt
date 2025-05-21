package com.discord.chat.bridge.contentnode

import Za.f
import kotlinx.serialization.KSerializer

@f
public class LineBreakContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<LineBreakContentNode> {
         return LineBreakContentNode.$serializer.INSTANCE;
      }
   }
}
