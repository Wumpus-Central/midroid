package com.discord.billing.types

import java.util.ArrayList
import kotlin.jvm.internal.q

internal object QueryProductDetailsParams {
   public fun create(productType: ProductType, productIds: List<String>): com.android.billingclient.api.QueryProductDetailsParams {
      q.h(var1, "productType");
      q.h(var2, "productIds");
      val var3: ArrayList = new ArrayList();

      for (java.lang.String var4 : var2) {
         val var8: com.android.billingclient.api.QueryProductDetailsParams.b = com.android.billingclient.api.QueryProductDetailsParams.b.a()
            .b(var4)
            .c(var1.getRawProductType())
            .a();
         q.g(var8, "build(...)");
         var3.add(var8);
      }

      val var5: com.android.billingclient.api.QueryProductDetailsParams.a = com.android.billingclient.api.QueryProductDetailsParams.a().b(var3);
      q.g(var5, "setProductList(...)");
      val var6: com.android.billingclient.api.QueryProductDetailsParams = var5.a();
      q.g(var6, "build(...)");
      return var6;
   }
}
