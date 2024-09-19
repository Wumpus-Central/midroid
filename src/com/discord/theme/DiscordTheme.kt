package com.discord.theme

import kotlin.enums.EnumEntries

public enum class DiscordTheme {
   DARK,
   DARK_LEGACY,
   LIGHT,
   MIDNIGHT   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private DiscordTheme[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<DiscordTheme> = $values();
      $VALUES = var0;
      $ENTRIES = mh.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
