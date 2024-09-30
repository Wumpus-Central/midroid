package com.discord.chat.presentation.list

import kotlin.enums.EnumEntries

public enum class ScrollDirection {
   DOWN,
   UP   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ScrollDirection[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<ScrollDirection> = $values();
      $VALUES = var0;
      $ENTRIES = rh.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
