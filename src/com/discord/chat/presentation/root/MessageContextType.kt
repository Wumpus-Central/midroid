package com.discord.chat.presentation.root

import kb.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import r9.j
import r9.m

@f
public enum class MessageContextType {
   DEFAULT,
   SEARCH   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MessageContextType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.b(m.k, new c());
   @JvmStatic
   public MessageContextType.Companion Companion = new MessageContextType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<MessageContextType> = $values();
      $VALUES = var0;
      $ENTRIES = z9.a.a(var0);
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
