package com.discord.billing.types

internal enum class ProductType(rawProductType: String) {
   IAP("inapp"),
   SUBSCRIPTIONS("subs")
   public final val rawProductType: String
   @JvmStatic
   private ProductType[] $VALUES = $values();

   init {
      this.rawProductType = var3;
   }
}
