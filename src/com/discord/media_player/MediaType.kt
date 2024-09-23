package com.discord.media_player

import kotlin.enums.EnumEntries

public enum class MediaType {
   AUDIO,
   GIFV,
   IMAGE,
   VIDEO   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MediaType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<MediaType> = $values();
      $VALUES = var0;
      $ENTRIES = mh.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
