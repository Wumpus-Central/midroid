package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import wc.m

@m
public class LineBreakContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<LineBreakContentNode> {
         return LineBreakContentNode.$serializer.INSTANCE;
      }
   }
}
