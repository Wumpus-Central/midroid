package com.discord.billing.types

import kotlin.jvm.internal.q

internal object SkuDetailsParams {
   public fun create(skuType: SkuType, skuIds: List<String>): com.android.billingclient.api.SkuDetailsParams {
      q.h(var1, "skuType");
      q.h(var2, "skuIds");
      val var3: com.android.billingclient.api.SkuDetailsParams = com.android.billingclient.api.SkuDetailsParams.c().c(var1.getRawType()).b(var2).a();
      q.g(var3, "build(...)");
      return var3;
   }
}
