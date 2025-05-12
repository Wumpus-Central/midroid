package com.discord.billing.react.events.serialization

import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.q
import o8.w

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   q.h(var0, "<this>");
   val var5: ArrayList = new ArrayList(i.v(var0, 10));
   val var8: java.util.Iterator = var0.iterator();

   val var7: ProductDetails;
   while (true) {
      if (!var8.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray$default(var5, null, 1, null);
      }

      var7 = var8.next() as ProductDetails;
      val var6: ArrayList = new ArrayList();
      val var1: Long;
      var var3: java.lang.String;
      val var4: java.lang.String;
      val var12: java.lang.String;
      if (q.c(var7.e(), "inapp")) {
         val var11: ProductDetails.b = var7.c();
         if (var11 == null) {
            var3 = var7.d();
            val var13: StringBuilder = new StringBuilder();
            var13.append("Could not find oneTimePurchaseOfferDetails for product: ");
            var13.append(var3);
            throw new AssertionError(var13.toString());
         }

         q.e(var11);
         var1 = var11.b();
         var3 = var11.a();
         var12 = var11.c();
         var4 = null;
      } else if (q.c(var7.e(), "subs")) {
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
            var3 = var7.d();
            val var17: StringBuilder = new StringBuilder();
            var17.append("Could not find pricingPhase for product: ");
            var17.append(var3);
            throw new AssertionError(var17.toString());
         }

         var1 = var16.d();
         var3 = var16.c();
         var4 = var16.b();
         var12 = var16.e();
         val var10: java.util.Iterator = var9.iterator();

         while (var10.hasNext()) {
            val var23: java.lang.String = (var10.next() as ProductDetails.d).b();
            if (var23 != null) {
               var6.add(var23);
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
            w.a("identifier", var7.d()),
            w.a("title", var7.g()),
            w.a("description", var7.a()),
            w.a("priceString", var3),
            w.a("currencyCode", var12),
            w.a("price", (int)(var1 / (long)10000)),
            w.a("type", var7.e()),
            w.a("offerIds", NativeArrayExtensionsKt.toNativeArray$default(var6, null, 1, null)),
            w.a("billingPeriod", var4)
         )
      );
   }

   val var22: java.lang.String = var7.d();
   val var18: StringBuilder = new StringBuilder();
   var18.append("Could not find subscriptionOfferDetails for product: ");
   var18.append(var22);
   throw new AssertionError(var18.toString());
}
