package com.discord.billing.types

import java.util.ArrayList

internal object QueryProductDetailsParams {
   public fun create(productType: ProductType, productIds: List<String>): com.android.billingclient.api.QueryProductDetailsParams {
      val var3: ArrayList = new ArrayList();

      for (java.lang.String var4 : var2) {
         val var8: com.android.billingclient.api.QueryProductDetailsParams.b = com.android.billingclient.api.QueryProductDetailsParams.b.a()
            .b(var4)
            .c(var1.getRawProductType())
            .a();
         var3.add(var8);
      }

      val var5: com.android.billingclient.api.QueryProductDetailsParams.a = com.android.billingclient.api.QueryProductDetailsParams.a().b(var3);
      val var6: com.android.billingclient.api.QueryProductDetailsParams = var5.a();
      return var6;
   }
}
