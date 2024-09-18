package com.discord.billing.react.events.serialization

import ch.w
import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.q

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   q.h(var0, "<this>");
   val var6: ArrayList = new ArrayList(i.u(var0, 10));
   val var8: java.util.Iterator = var0.iterator();

   val var9: ProductDetails;
   while (true) {
      if (!var8.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray(var6);
      }

      var9 = var8.next() as ProductDetails;
      val var7: ArrayList = new ArrayList();
      val var3: Boolean = q.c(var9.e(), "inapp");
      var var5: java.lang.String = null;
      var var4: StringBuilder = null;
      val var1: Long;
      val var13: java.lang.String;
      if (var3) {
         val var12: ProductDetails.a = var9.c();
         if (var12 == null) {
            val var14: java.lang.String = var9.d();
            var4 = new StringBuilder();
            var4.append("Could not find oneTimePurchaseOfferDetails for product: ");
            var4.append(var14);
            throw new AssertionError(var4.toString());
         }

         q.e(var12);
         var1 = var12.b();
         var5 = var12.a();
         var4 = var12.c();
         var13 = null;
      } else if (q.c(var9.e(), "subs")) {
         val var10: java.util.List = var9.f();
         if (var10 == null) {
            break;
         }

         val var24: java.util.Iterator = var10.iterator();

         do {
            var15 = var4;
            if (!var24.hasNext()) {
               break;
            }

            var15 = var24.next();
         } while (((ProductDetails.c)var15).b() != null);

         val var16: ProductDetails.c = var15 as ProductDetails.c;
         if (var15 as ProductDetails.c == null) {
            break;
         }

         val var21: ProductDetails.PricingPhase = var16.e().a().get(0) as ProductDetails.PricingPhase;
         if (var21 == null) {
            val var17: java.lang.String = var9.d();
            var4 = new StringBuilder();
            var4.append("Could not find pricingPhase for product: ");
            var4.append(var17);
            throw new AssertionError(var4.toString());
         }

         var1 = var21.d();
         var5 = var21.c();
         var13 = var21.b();
         var4 = var21.e();
         val var11: java.util.Iterator = var10.iterator();

         while (var11.hasNext()) {
            val var25: java.lang.String = (var11.next() as ProductDetails.c).b();
            if (var25 != null) {
               var7.add(var25);
            }
         }
      } else {
         var1 = 0L;
         var4 = null;
         var13 = null;
      }

      var6.add(
         NativeMapExtensionsKt.nativeMapOf(
            w.a("identifier", var9.d()),
            w.a("title", var9.g()),
            w.a("description", var9.a()),
            w.a("priceString", var5),
            w.a("currencyCode", var4),
            w.a("price", (int)(var1 / (long)10000)),
            w.a("type", var9.e()),
            w.a("offerIds", NativeArrayExtensionsKt.toNativeArray(var7)),
            w.a("billingPeriod", var13)
         )
      );
   }

   val var23: java.lang.String = var9.d();
   val var18: StringBuilder = new StringBuilder();
   var18.append("Could not find subscriptionOfferDetails for product: ");
   var18.append(var23);
   throw new AssertionError(var18.toString());
}
