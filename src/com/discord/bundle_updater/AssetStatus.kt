package com.discord.bundle_updater

import kotlin.enums.EnumEntries

public enum class AssetStatus {
   CopyFromPrevious,
   Download   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private AssetStatus[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<AssetStatus> = $values();
      $VALUES = var0;
      $ENTRIES = ck.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
