package com.discord.billing.types

import kotlin.jvm.internal.r

internal object SkuDetailsParams {
   public fun create(skuType: SkuType, skuIds: List<String>): com.android.billingclient.api.SkuDetailsParams {
      r.h(var1, "skuType");
      r.h(var2, "skuIds");
      val var3: com.android.billingclient.api.SkuDetailsParams = com.android.billingclient.api.SkuDetailsParams.c().c(var1.getRawType()).b(var2).a();
      r.g(var3, "newBuilder()\n           …Ids)\n            .build()");
      return var3;
   }
}
