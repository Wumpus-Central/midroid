package com.discord.chat.bridge.spoiler

import kotlin.enums.EnumEntries
import nh.a

public enum class SpoilerType {
   OBSCURE,
   SPOILER   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private SpoilerType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<SpoilerType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
