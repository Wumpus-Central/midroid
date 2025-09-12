package com.discord.chat.input.bridge

import Ca.l
import Ca.o
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import pc.m
import s2.a

@m
public enum class ChatInputNodeFontWeight {
   Bold;

   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChatInputNodeFontWeight[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.e, new a());

   @JvmStatic
   fun {
      val var0: Array<ChatInputNodeFontWeight> = $values();
      $VALUES = var0;
      $ENTRIES = Ia.a.a(var0);
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
