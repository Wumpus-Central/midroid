package com.discord.chat.presentation.list

import kotlin.enums.EnumEntries

public enum class SwipeActionType {
   Edit,
   Reply   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private SwipeActionType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<SwipeActionType> = $values();
      $VALUES = var0;
      $ENTRIES = rh.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
