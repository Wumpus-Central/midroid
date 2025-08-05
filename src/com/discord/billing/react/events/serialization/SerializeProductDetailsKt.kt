package com.discord.billing.react.events.serialization

import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.r
import z9.s

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   r.h(var0, "<this>");
   val var5: ArrayList = new ArrayList(i.v(var0, 10));
   val var6: java.util.Iterator = var0.iterator();

   val var7: ProductDetails;
   while (true) {
      if (!var6.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray$default(var5, null, 1, null);
      }

      var7 = var6.next() as ProductDetails;
      val var8: ArrayList = new ArrayList();
      val var1: Long;
      val var3: java.lang.String;
      val var4: java.lang.String;
      val var12: java.lang.String;
      if (r.c(var7.e(), "inapp")) {
         val var11: ProductDetails.b = var7.c();
         if (var11 == null) {
            val var13: java.lang.String = var7.d();
            val var19: StringBuilder = new StringBuilder();
            var19.append("Could not find oneTimePurchaseOfferDetails for product: ");
            var19.append(var13);
            throw new AssertionError(var19.toString());
         }

         var1 = var11.b();
         var3 = var11.a();
         var12 = var11.c();
         var4 = null;
      } else if (r.c(var7.e(), "subs")) {
         val var9: java.util.List = var7.f();
         if (var9 == null) {
            break;
         }

         val var20: java.util.Iterator = var9.iterator();

         do {
            if (!var20.hasNext()) {
               var14 = null;
               break;
            }

            var14 = var20.next();
         } while (((ProductDetails.d)var14).b() != null);

         val var15: ProductDetails.d = var14 as ProductDetails.d;
         if (var14 as ProductDetails.d == null) {
            break;
         }

         val var16: ProductDetails.PricingPhase = var15.e().a().get(0) as ProductDetails.PricingPhase;
         if (var16 == null) {
            val var17: java.lang.String = var7.d();
            val var21: StringBuilder = new StringBuilder();
            var21.append("Could not find pricingPhase for product: ");
            var21.append(var17);
            throw new AssertionError(var21.toString());
         }

         var1 = var16.d();
         var3 = var16.c();
         var4 = var16.b();
         var12 = var16.e();
         val var23: java.util.Iterator = var9.iterator();

         while (var23.hasNext()) {
            val var10: java.lang.String = (var23.next() as ProductDetails.d).b();
            if (var10 != null) {
               var8.add(var10);
            }
         }
      } else {
         var1 = 0L;
         var12 = null;
         var3 = null;
         var4 = null;
      }

      var5.add(
         NativeMapExtensionsKt.nativeMapOf(
            s.a("identifier", var7.d()),
            s.a("title", var7.g()),
            s.a("description", var7.a()),
            s.a("priceString", var3),
            s.a("currencyCode", var12),
            s.a("price", (int)(var1 / (long)10000)),
            s.a("type", var7.e()),
            s.a("offerIds", NativeArrayExtensionsKt.toNativeArray$default(var8, null, 1, null)),
            s.a("billingPeriod", var4)
         )
      );
   }

   val var22: java.lang.String = var7.d();
   val var18: StringBuilder = new StringBuilder();
   var18.append("Could not find subscriptionOfferDetails for product: ");
   var18.append(var22);
   throw new AssertionError(var18.toString());
}
