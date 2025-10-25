package com.discord.chat.input.bridge

import kc.m
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import s2.a
import xa.l
import xa.o

@m
public enum class ChatInputNodeFontWeight {
   Bold;

   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChatInputNodeFontWeight[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.e, new a());

   @JvmStatic
   fun {
      val var0: Array<ChatInputNodeFontWeight> = $values();
      $VALUES = var0;
      $ENTRIES = Da.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNodeFontWeight> {
         return this.get$cachedSerializer();
      }
   }
}
