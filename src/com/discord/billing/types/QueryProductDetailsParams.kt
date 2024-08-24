package com.discord.billing.types

import com.android.billingclient.api.QueryProductDetailsParams.a
import com.android.billingclient.api.QueryProductDetailsParams.b
import java.util.ArrayList
import kotlin.jvm.internal.r

internal object QueryProductDetailsParams {
   public fun create(productType: ProductType, productIds: List<String>): com.android.billingclient.api.QueryProductDetailsParams {
      r.h(var1, "productType");
      r.h(var2, "productIds");
      val var3: ArrayList = new ArrayList();

      for (java.lang.String var4 : var2) {
         val var8: b = b.a().b(var4).c(var1.getRawProductType()).a();
         r.g(var8, "newBuilder()\n           …                 .build()");
         var3.add(var8);
      }

      val var5: a = com.android.billingclient.api.QueryProductDetailsParams.a().b(var3);
      r.g(var5, "newBuilder().setProductList(productList)");
      val var6: com.android.billingclient.api.QueryProductDetailsParams = var5.a();
      r.g(var6, "params.build()");
      return var6;
   }
}
