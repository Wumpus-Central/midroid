package com.discord.chat.input.bridge

import dn.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import lj.l
import lj.o
import sj.a

@f
public enum class ChatInputNodeFontWeight {
   Bold;

   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChatInputNodeFontWeight[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);

   @JvmStatic
   fun {
      val var0: Array<ChatInputNodeFontWeight> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
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
