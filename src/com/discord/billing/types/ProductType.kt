package com.discord.billing.types

import ck.a
import kotlin.enums.EnumEntries

internal enum class ProductType(rawProductType: String) {
   IAP("inapp"),
   SUBSCRIPTIONS("subs")
   public final val rawProductType: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ProductType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<ProductType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.rawProductType = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
