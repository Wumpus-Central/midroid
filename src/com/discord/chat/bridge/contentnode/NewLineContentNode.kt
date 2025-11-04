package com.discord.chat.bridge.contentnode

import kc.m
import kotlinx.serialization.KSerializer

@m
public class NewLineContentNode : ContentNode() {
   public companion object {
      public fun serializer(): KSerializer<NewLineContentNode> {
         return NewLineContentNode.$serializer.INSTANCE;
      }
   }
}
