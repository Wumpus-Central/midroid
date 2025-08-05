package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import ub.g

@g
public class LineBreakContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<LineBreakContentNode> {
         return LineBreakContentNode.$serializer.INSTANCE;
      }
   }
}
