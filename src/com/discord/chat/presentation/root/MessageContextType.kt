package com.discord.chat.presentation.root

import dh.l
import dh.o
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import vk.f

@f
public enum class MessageContextType {
   DEFAULT,
   SEARCH   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MessageContextType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MessageContextType.Companion Companion = new MessageContextType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<MessageContextType> = $values();
      $VALUES = var0;
      $ENTRIES = kh.a.a(var0);
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
