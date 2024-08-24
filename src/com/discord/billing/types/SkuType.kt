package com.discord.billing.types

internal enum class SkuType(rawType: String) {
   IAP("inapp"),
   SUBSCRIPTIONS("subs")
   public final val rawType: String
   @JvmStatic
   private SkuType[] $VALUES = $values();

   init {
      this.rawType = var3;
   }
}
