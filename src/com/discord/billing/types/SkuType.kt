package com.discord.billing.types

import jh.a
import kotlin.enums.EnumEntries

internal enum class SkuType(rawType: String) {
   IAP("inapp"),
   SUBSCRIPTIONS("subs")
   public final val rawType: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private SkuType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<SkuType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.rawType = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
