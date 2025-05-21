package com.discord.chat.input.bridge

import Ja.f
import Q8.j
import Q8.m
import f1.a
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer

@f
public enum class ChatInputNodeFontWeight {
   Bold;

   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChatInputNodeFontWeight[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.a(m.k, new a());

   @JvmStatic
   fun {
      val var0: Array<ChatInputNodeFontWeight> = $values();
      $VALUES = var0;
      $ENTRIES = Y8.a.a(var0);
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
