package com.discord.chat.presentation.root

import ha.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import o8.l
import o8.o

@f
public enum class MessageContextType {
   DEFAULT,
   SEARCH   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MessageContextType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MessageContextType.Companion Companion = new MessageContextType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<MessageContextType> = $values();
      $VALUES = var0;
      $ENTRIES = w8.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<MessageContextType> {
         return this.get$cachedSerializer();
      }
   }
}
