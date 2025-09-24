package com.discord.chat.input.bridge

import B9.j
import B9.m
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import nb.g
import s1.a

@g
public enum class ChatInputNodeFontWeight {
   Bold;

   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChatInputNodeFontWeight[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.a(m.e, new a());

   @JvmStatic
   fun {
      val var0: Array<ChatInputNodeFontWeight> = $values();
      $VALUES = var0;
      $ENTRIES = H9.a.a(var0);
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
