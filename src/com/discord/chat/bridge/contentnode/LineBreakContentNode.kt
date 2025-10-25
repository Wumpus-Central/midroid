package com.discord.chat.bridge.contentnode

import kc.m
import kotlinx.serialization.KSerializer

@m
public class LineBreakContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<LineBreakContentNode> {
         return LineBreakContentNode.$serializer.INSTANCE;
      }
   }
}
