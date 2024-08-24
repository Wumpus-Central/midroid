package com.discord.chat.presentation.root

import eh.l
import eh.o
import kotlinx.serialization.KSerializer
import uk.f

@f
public enum class MessageContextType {
   DEFAULT,
   SEARCH   @JvmStatic
   private MessageContextType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MessageContextType.Companion Companion = new MessageContextType.Companion(null);

   public companion object {
      public fun serializer(): KSerializer<MessageContextType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<MessageContextType>;
      }
   }
}
