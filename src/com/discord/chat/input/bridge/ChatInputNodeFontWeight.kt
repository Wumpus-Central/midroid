package com.discord.chat.input.bridge

import eh.l
import eh.o
import kotlinx.serialization.KSerializer
import uk.f

@f
public enum class ChatInputNodeFontWeight {
   Bold;

   @JvmStatic
   private ChatInputNodeFontWeight[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);

   public companion object {
      public fun serializer(): KSerializer<ChatInputNodeFontWeight> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<ChatInputNodeFontWeight>;
      }
   }
}
