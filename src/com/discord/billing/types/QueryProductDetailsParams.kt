package com.discord.billing.types

import java.util.ArrayList
import kotlin.jvm.internal.r

internal object QueryProductDetailsParams {
   public fun create(productType: ProductType, productIds: List<String>): com.android.billingclient.api.QueryProductDetailsParams {
      r.h(var1, "productType");
      r.h(var2, "productIds");
      val var3: ArrayList = new ArrayList();

      for (java.lang.String var4 : var2) {
         val var8: com.android.billingclient.api.QueryProductDetailsParams.b = com.android.billingclient.api.QueryProductDetailsParams.b.a()
            .b(var4)
            .c(var1.getRawProductType())
            .a();
         r.g(var8, "build(...)");
         var3.add(var8);
      }

      val var5: com.android.billingclient.api.QueryProductDetailsParams.a = com.android.billingclient.api.QueryProductDetailsParams.a().b(var3);
      r.g(var5, "setProductList(...)");
      val var6: com.android.billingclient.api.QueryProductDetailsParams = var5.a();
      r.g(var6, "build(...)");
      return var6;
   }
}
