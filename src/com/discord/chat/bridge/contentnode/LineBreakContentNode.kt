package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import tb.f

@f
public class LineBreakContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<LineBreakContentNode> {
         return LineBreakContentNode.$serializer.INSTANCE;
      }
   }
}
