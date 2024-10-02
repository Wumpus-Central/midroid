package com.discord.billing.types

import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.SkuDetails
import com.android.billingclient.api.ProductDetails.PricingPhase
import java.security.MessageDigest
import java.util.ArrayList
import java.util.Arrays
import kotlin.jvm.internal.q
import qk.a

internal object BillingFlowParams {
   private fun calculateStandardizedUnits(oldPeriod: String, newPeriod: String): Int {
      val var3: Byte;
      if (q.c(var1, "P1M") && q.c(var2, "P1Y")) {
         var3 = 12;
      } else if (q.c(var1, "P1M") && q.c(var2, "P6M")) {
         var3 = 6;
      } else if (q.c(var1, "P1M") && q.c(var2, "P3M")) {
         var3 = 3;
      } else if (q.c(var1, "P3M") && q.c(var2, "P1Y")) {
         var3 = 4;
      } else if ((!q.c(var1, "P3M") || !q.c(var2, "P6M")) && (!q.c(var1, "P6M") || !q.c(var2, "P1Y"))) {
         var3 = 1;
      } else {
         var3 = 2;
      }

      return var3;
   }

   private fun getObfuscatedUserId(userId: String): String {
      val var4: MessageDigest = MessageDigest.getInstance("SHA-256");
      val var7: ByteArray = var1.getBytes(a.b);
      q.g(var7, "getBytes(...)");
      val var9: ByteArray = var4.digest(var7);
      q.g(var9, "digest(...)");
      val var3: Int = var9.length;
      var1 = "";

      for (int var2 = 0; var2 < var3; var2++) {
         val var5: java.lang.String = java.lang.String.format("%02x", Arrays.copyOf(new Object[]{var9[var2]}, 1));
         q.g(var5, "format(...)");
         val var6: StringBuilder = new StringBuilder();
         var6.append(var1);
         var6.append(var5);
         var1 = var6.toString();
      }

      return var1;
   }

   private fun getPriceAmountMicros(productDetails: ProductDetails): Long {
      if (q.c(var1.e(), "inapp")) {
         val var2: ProductDetails.b = var1.c();
         if (var2 != null) {
            return var2.b();
         }
      } else if (q.c(var1.e(), "subs")) {
         return this.getPricingPhase(var1).d();
      }

      return 0L;
   }

   private fun getPricingPhase(productDetails: ProductDetails): PricingPhase {
      if (q.c(var1.e(), "inapp")) {
         throw new AssertionError("Attempted to retrieve pricing phase for one time purchase");
      } else {
         val var4: java.util.List = var1.f();
         val var7: ProductDetails.d;
         if (var4 != null) {
            val var2: java.util.Iterator = var4.iterator();

            do {
               if (!var2.hasNext()) {
                  var5 = null;
                  break;
               }

               var5 = var2.next();
            } while (((ProductDetails.d)var5).b() != null);

            var7 = var5 as ProductDetails.d;
         } else {
            var7 = null;
         }

         var var6: ProductDetails.PricingPhase = null;
         if (var7 != null) {
            val var8: ProductDetails.c = var7.e();
            var6 = null;
            if (var8 != null) {
               val var9: java.util.List = var8.a();
               var6 = null;
               if (var9 != null) {
                  var6 = var9.get(0) as ProductDetails.PricingPhase;
               }
            }
         }

         if (var6 != null) {
            return var6;
         } else {
            throw new AssertionError("No pricing phase found for subscription product details");
         }
      }
   }

   private fun getReplacementMode(oldProductDetails: ProductDetails, newProductDetails: ProductDetails): Int {
      val var4: Long = this.getPriceAmountMicros(var1);
      val var6: Long = this.getPriceAmountMicros(var2);
      val var8: java.lang.String = this.getPricingPhase(var1).b();
      q.g(var8, "getBillingPeriod(...)");
      val var9: java.lang.String = this.getPricingPhase(var2).b();
      q.g(var9, "getBillingPeriod(...)");
      val var3: Byte;
      if (var6 / this.calculateStandardizedUnits(var8, var9) <= var4) {
         var3 = 6;
      } else {
         var3 = 2;
      }

      return var3;
   }

   private fun getReplacementMode(oldSkuDetails: SkuDetails, newSkuDetails: SkuDetails): Int {
      val var6: Long = var1.c();
      val var4: Long = var2.c();
      val var8: java.lang.String = var1.f();
      q.g(var8, "getSubscriptionPeriod(...)");
      val var9: java.lang.String = var2.f();
      q.g(var9, "getSubscriptionPeriod(...)");
      val var3: Byte;
      if (var4 / this.calculateStandardizedUnits(var8, var9) <= var6) {
         var3 = 6;
      } else {
         var3 = 2;
      }

      return var3;
   }

   public fun create(skuDetails: List<SkuDetails>?, skuId: String, skuIdOld: String?, purchaseToken: String?, userId: String): com.android.billingclient.api.BillingFlowParams? {
      q.h(var2, "skuId");
      q.h(var5, "userId");
      val var11: SkuDetails;
      if (var1 != null) {
         val var7: java.util.Iterator = var1.iterator();

         while (true) {
            if (!var7.hasNext()) {
               var10 = null;
               break;
            }

            val var6: Any = var7.next();
            if (q.c((var6 as SkuDetails).e(), var2)) {
               var10 = var6;
               break;
            }
         }

         var11 = var10 as SkuDetails;
      } else {
         var11 = null;
      }

      val var9: SkuDetails;
      if (var1 != null) {
         val var13: java.util.Iterator = var1.iterator();

         do {
            if (!var13.hasNext()) {
               var8 = null;
               break;
            }

            var8 = var13.next();
         } while (!q.c(((SkuDetails)var8).e(), var3));

         var9 = var8 as SkuDetails;
      } else {
         var9 = null;
      }

      if (var11 != null && (var3 == null || var9 != null)) {
         val var12: com.android.billingclient.api.BillingFlowParams.a = com.android.billingclient.api.BillingFlowParams.a()
            .f(var11)
            .c(this.getObfuscatedUserId(var5));
         if (var9 != null && var4 != null) {
            var12.g(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.a().b(var4).d(INSTANCE.getReplacementMode(var9, var11)).a());
         }

         return var12.a();
      } else {
         return null;
      }
   }

   public fun createWithProductDetails(
      productDetails: List<ProductDetails>,
      productId: String,
      productIdOld: String?,
      purchaseToken: String?,
      userId: String,
      offerId: String?
   ): com.android.billingclient.api.BillingFlowParams? {
      q.h(var1, "productDetails");
      q.h(var2, "productId");
      q.h(var5, "userId");
      val var10: java.util.Iterator = var1.iterator();

      while (true) {
         if (var10.hasNext()) {
            val var9: Any = var10.next();
            if (!q.c((var9 as ProductDetails).d(), var2)) {
               continue;
            }

            var19 = var9;
            break;
         }

         var19 = null;
         break;
      }

      val var20: ProductDetails = var19 as ProductDetails;
      if (var19 as ProductDetails == null) {
         throw new AssertionError("Could not find product detail for new product");
      } else {
         val var23: java.util.Iterator = var1.iterator();

         do {
            if (!var23.hasNext()) {
               var12 = null;
               break;
            }

            var12 = var23.next();
         } while (!q.c(((ProductDetails)var12).d(), var3));

         val var24: ProductDetails = var12 as ProductDetails;
         if (var3 != null && var12 as ProductDetails == null) {
            return null;
         } else {
            val var22: ArrayList = new ArrayList();
            val var25: com.android.billingclient.api.BillingFlowParams.b.a = com.android.billingclient.api.BillingFlowParams.b.a().c(var20);
            q.g(var25, "setProductDetails(...)");
            if (q.c(var20.e(), "subs")) {
               var var13: java.lang.String;
               if (var6 != null) {
                  val var28: java.util.List = var20.f();
                  var13 = null;
                  if (var28 != null) {
                     val var29: java.util.Iterator = var28.iterator();

                     do {
                        if (!var29.hasNext()) {
                           var15 = null;
                           break;
                        }

                        var15 = var29.next();
                     } while (!q.c(((ProductDetails.d)var15).b(), var6));

                     val var30: ProductDetails.d = var15 as ProductDetails.d;
                     var13 = null;
                     if (var30 != null) {
                        var13 = var30.d();
                     }
                  }
               } else {
                  val var11: java.util.List = var20.f();
                  var13 = null;
                  if (var11 != null) {
                     val var26: java.util.Iterator = var11.iterator();

                     do {
                        if (!var26.hasNext()) {
                           var14 = null;
                           break;
                        }

                        var14 = var26.next();
                     } while (((ProductDetails.d)var14).b() != null);

                     val var27: ProductDetails.d = var14 as ProductDetails.d;
                     var13 = null;
                     if (var27 != null) {
                        var13 = var27.d();
                     }
                  }
               }

               if (var13 == null) {
                  var2 = var20.d();
                  val var18: StringBuilder = new StringBuilder();
                  var18.append("Could not find offer token for productId: ");
                  var18.append(var2);
                  var18.append(" offerId: ");
                  var18.append(var6);
                  throw new AssertionError(var18.toString());
               }

               var25.b(var13);
            }

            val var16: com.android.billingclient.api.BillingFlowParams.b = var25.a();
            q.g(var16, "build(...)");
            var22.add(var16);
            val var17: com.android.billingclient.api.BillingFlowParams.a = com.android.billingclient.api.BillingFlowParams.a()
               .e(var22)
               .c(this.getObfuscatedUserId(var5))
               .b(false);
            if (var24 != null && var4 != null) {
               var17.g(com.android.billingclient.api.BillingFlowParams.SubscriptionUpdateParams.a().b(var4).d(INSTANCE.getReplacementMode(var24, var20)).a());
            }

            return var17.a();
         }
      }
   }
}
