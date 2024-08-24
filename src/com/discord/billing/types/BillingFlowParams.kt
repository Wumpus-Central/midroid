package com.discord.billing.types

import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.SkuDetails
import com.android.billingclient.api.ProductDetails.PricingPhase
import com.android.billingclient.api.ProductDetails.b
import com.android.billingclient.api.ProductDetails.c
import ik.a
import java.security.MessageDigest
import java.util.ArrayList
import java.util.Arrays
import kotlin.jvm.internal.r

internal object BillingFlowParams {
   private fun calculateStandardizedUnits(oldPeriod: String, newPeriod: String): Int {
      val var3: Byte;
      if (r.c(var1, "P1M") && r.c(var2, "P1Y")) {
         var3 = 12;
      } else if (r.c(var1, "P1M") && r.c(var2, "P6M")) {
         var3 = 6;
      } else if (r.c(var1, "P1M") && r.c(var2, "P3M")) {
         var3 = 3;
      } else if (r.c(var1, "P3M") && r.c(var2, "P1Y")) {
         var3 = 4;
      } else if ((!r.c(var1, "P3M") || !r.c(var2, "P6M")) && (!r.c(var1, "P6M") || !r.c(var2, "P1Y"))) {
         var3 = 1;
      } else {
         var3 = 2;
      }

      return var3;
   }

   private fun getObfuscatedUserId(userId: String): String {
      val var4: MessageDigest = MessageDigest.getInstance("SHA-256");
      val var7: ByteArray = var1.getBytes(a.b);
      r.g(var7, "this as java.lang.String).getBytes(charset)");
      val var9: ByteArray = var4.digest(var7);
      r.g(var9, "getInstance(\"SHA-256\")\n …est(userId.toByteArray())");
      val var3: Int = var9.length;
      var1 = "";

      for (int var2 = 0; var2 < var3; var2++) {
         val var6: java.lang.String = java.lang.String.format("%02x", Arrays.copyOf(new Object[]{var9[var2]}, 1));
         r.g(var6, "format(this, *args)");
         val var5: StringBuilder = new StringBuilder();
         var5.append(var1);
         var5.append(var6);
         var1 = var5.toString();
      }

      return var1;
   }

   private fun getPriceAmountMicros(productDetails: ProductDetails): Long {
      if (r.c(var1.e(), "inapp")) {
         val var2: com.android.billingclient.api.ProductDetails.a = var1.c();
         if (var2 != null) {
            return var2.b();
         }
      } else if (r.c(var1.e(), "subs")) {
         return this.getPricingPhase(var1).d();
      }

      return 0L;
   }

   private fun getPricingPhase(productDetails: ProductDetails): PricingPhase {
      if (r.c(var1.e(), "inapp")) {
         throw new AssertionError("Attempted to retrieve pricing phase for one time purchase");
      } else {
         val var5: java.util.List = var1.f();
         val var8: c;
         if (var5 != null) {
            label39: {
               for (var6 : var5) {
                  val var2: Boolean;
                  if ((var6 as c).b() == null) {
                     var2 = true;
                  } else {
                     var2 = false;
                  }

                  if (var2) {
                     break label39;
                  }
               }

               var6 = null;
            }

            var8 = var6 as c;
         } else {
            var8 = null;
         }

         var var7: PricingPhase = null;
         if (var8 != null) {
            val var9: b = var8.e();
            var7 = null;
            if (var9 != null) {
               val var10: java.util.List = var9.a();
               var7 = null;
               if (var10 != null) {
                  var7 = var10.get(0) as PricingPhase;
               }
            }
         }

         if (var7 != null) {
            return var7;
         } else {
            throw new AssertionError("No pricing phase found for subscription product details");
         }
      }
   }

   private fun getProrationMode(oldProductDetails: ProductDetails, newProductDetails: ProductDetails): Int {
      val var6: Long = this.getPriceAmountMicros(var1);
      val var4: Long = this.getPriceAmountMicros(var2);
      val var8: java.lang.String = this.getPricingPhase(var1).b();
      r.g(var8, "getPricingPhase(oldProductDetails).billingPeriod");
      val var9: java.lang.String = this.getPricingPhase(var2).b();
      r.g(var9, "getPricingPhase(newProductDetails).billingPeriod");
      val var3: Byte;
      if (var4 / this.calculateStandardizedUnits(var8, var9) <= var6) {
         var3 = 4;
      } else {
         var3 = 2;
      }

      return var3;
   }

   private fun getProrationMode(oldSkuDetails: SkuDetails, newSkuDetails: SkuDetails): Int {
      val var4: Long = var1.c();
      val var6: Long = var2.c();
      val var8: java.lang.String = var1.f();
      r.g(var8, "oldSkuDetails.subscriptionPeriod");
      val var9: java.lang.String = var2.f();
      r.g(var9, "newSkuDetails.subscriptionPeriod");
      val var3: Byte;
      if (var6 / this.calculateStandardizedUnits(var8, var9) <= var4) {
         var3 = 4;
      } else {
         var3 = 2;
      }

      return var3;
   }

   public fun create(skuDetails: List<SkuDetails>?, skuId: String, skuIdOld: String?, purchaseToken: String?, userId: String): com.android.billingclient.api.BillingFlowParams? {
      r.h(var2, "skuId");
      r.h(var5, "userId");
      val var11: SkuDetails;
      if (var1 != null) {
         val var7: java.util.Iterator = var1.iterator();

         while (true) {
            if (!var7.hasNext()) {
               var10 = null;
               break;
            }

            val var6: Any = var7.next();
            if (r.c((var6 as SkuDetails).e(), var2)) {
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
         } while (!r.c(((SkuDetails)var8).e(), var3));

         var9 = var8 as SkuDetails;
      } else {
         var9 = null;
      }

      if (var11 != null && (var3 == null || var9 != null)) {
         val var12: com.android.billingclient.api.BillingFlowParams.a = com.android.billingclient.api.BillingFlowParams.a()
            .f(var11)
            .c(this.getObfuscatedUserId(var5));
         if (var9 != null && var4 != null) {
            var12.g(com.android.billingclient.api.BillingFlowParams.c.a().c(var4).f(INSTANCE.getProrationMode(var9, var11)).a());
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
      r.h(var1, "productDetails");
      r.h(var2, "productId");
      r.h(var5, "userId");
      val var11: java.util.Iterator = var1.iterator();

      while (true) {
         if (var11.hasNext()) {
            val var10: Any = var11.next();
            if (!r.c((var10 as ProductDetails).d(), var2)) {
               continue;
            }

            var20 = var10;
            break;
         }

         var20 = null;
         break;
      }

      val var21: ProductDetails = var20 as ProductDetails;
      if (var20 as ProductDetails == null) {
         throw new AssertionError("Could not find product detail for new product");
      } else {
         val var24: java.util.Iterator = var1.iterator();

         do {
            if (!var24.hasNext()) {
               var13 = null;
               break;
            }

            var13 = var24.next();
         } while (!r.c(((ProductDetails)var13).d(), var3));

         val var25: ProductDetails = var13 as ProductDetails;
         if (var3 != null && var13 as ProductDetails == null) {
            return null;
         } else {
            val var23: ArrayList = new ArrayList();
            val var26: com.android.billingclient.api.BillingFlowParams.b.a = com.android.billingclient.api.BillingFlowParams.b.a().c(var21);
            r.g(var26, "newBuilder()\n           …etails(newProductDetails)");
            if (r.c(var21.e(), "subs")) {
               var var14: java.lang.String;
               if (var6 != null) {
                  val var29: java.util.List = var21.f();
                  var14 = null;
                  if (var29 != null) {
                     val var30: java.util.Iterator = var29.iterator();

                     do {
                        if (!var30.hasNext()) {
                           var16 = null;
                           break;
                        }

                        var16 = var30.next();
                     } while (!r.c(((c)var16).b(), var6));

                     val var31: c = var16 as c;
                     var14 = null;
                     if (var31 != null) {
                        var14 = var31.d();
                     }
                  }
               } else {
                  val var12: java.util.List = var21.f();
                  var14 = null;
                  if (var12 != null) {
                     val var27: java.util.Iterator = var12.iterator();

                     val var7: Boolean;
                     do {
                        if (!var27.hasNext()) {
                           var15 = null;
                           break;
                        }

                        var15 = var27.next();
                        if ((var15 as c).b() == null) {
                           var7 = true;
                        } else {
                           var7 = false;
                        }
                     } while (!var7);

                     val var28: c = var15 as c;
                     var14 = null;
                     if (var28 != null) {
                        var14 = var28.d();
                     }
                  }
               }

               if (var14 == null) {
                  var2 = var21.d();
                  val var19: StringBuilder = new StringBuilder();
                  var19.append("Could not find offer token for productId: ");
                  var19.append(var2);
                  var19.append(" offerId: ");
                  var19.append(var6);
                  throw new AssertionError(var19.toString());
               }

               var26.b(var14);
            }

            val var17: com.android.billingclient.api.BillingFlowParams.b = var26.a();
            r.g(var17, "params.build()");
            var23.add(var17);
            val var18: com.android.billingclient.api.BillingFlowParams.a = com.android.billingclient.api.BillingFlowParams.a()
               .e(var23)
               .c(this.getObfuscatedUserId(var5))
               .b(false);
            if (var25 != null && var4 != null) {
               var18.g(com.android.billingclient.api.BillingFlowParams.c.a().b(var4).e(INSTANCE.getProrationMode(var25, var21)).a());
            }

            return var18.a();
         }
      }
   }
}
