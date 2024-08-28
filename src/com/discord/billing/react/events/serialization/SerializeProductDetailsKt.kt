package com.discord.billing.react.events.serialization

import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.q
import lj.w

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   q.h(var0, "<this>");
   val var7: ArrayList = new ArrayList(i.u(var0, 10));
   val var10: java.util.Iterator = var0.iterator();

   val var9: ProductDetails;
   while (true) {
      if (!var10.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray(var7);
      }

      var var2: Long;
      var var8: ArrayList;
      var var23: java.lang.String;
      var var28: java.lang.String;
      label55: {
         var9 = var10.next() as ProductDetails;
         var8 = new ArrayList();
         val var1: Boolean = q.c(var9.e(), "inapp");
         var23 = null;
         if (var1) {
            val var13: ProductDetails.a = var9.c();
            if (var13 == null) {
               var23 = var9.d();
               val var15: StringBuilder = new StringBuilder();
               var15.append("Could not find oneTimePurchaseOfferDetails for product: ");
               var15.append(var23);
               throw new AssertionError(var15.toString());
            }

            q.e(var13);
            var2 = var13.b();
            var28 = var13.a();
            var23 = var13.c();
            var14 = null;
         } else {
            if (!q.c(var9.e(), "subs")) {
               var2 = 0L;
               var14 = null;
               var23 = null;
               var28 = null;
               break label55;
            }

            val var6: java.util.List = var9.f();
            if (var6 == null) {
               break;
            }

            val var27: java.util.Iterator = var6.iterator();

            do {
               var16 = var23;
               if (!var27.hasNext()) {
                  break;
               }

               var16 = var27.next();
            } while (((ProductDetails.c)var16).b() != null);

            val var17: ProductDetails.c = var16 as ProductDetails.c;
            if (var16 as ProductDetails.c == null) {
               break;
            }

            val var22: ProductDetails.PricingPhase = var17.e().a().get(0) as ProductDetails.PricingPhase;
            if (var22 == null) {
               var23 = var9.d();
               val var18: StringBuilder = new StringBuilder();
               var18.append("Could not find pricingPhase for product: ");
               var18.append(var23);
               throw new AssertionError(var18.toString());
            }

            var2 = var22.d();
            var28 = var22.c();
            var14 = var22.b();
            var23 = var22.e();
            val var29: java.util.Iterator = var6.iterator();

            while (var29.hasNext()) {
               val var11: java.lang.String = (var29.next() as ProductDetails.c).b();
               if (var11 != null) {
                  var8.add(var11);
               }
            }
         }

         var28 = var23;
         var23 = var28;
      }

      var7.add(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               w.a("identifier", var9.d()),
               w.a("title", var9.g()),
               w.a("description", var9.a()),
               w.a("priceString", var23),
               w.a("currencyCode", var28),
               w.a("price", (int)(var2 / (long)10000)),
               w.a("type", var9.e()),
               w.a("offerIds", NativeArrayExtensionsKt.toNativeArray(var8)),
               w.a("billingPeriod", var14)
            }
         )
      );
   }

   val var25: java.lang.String = var9.d();
   val var19: StringBuilder = new StringBuilder();
   var19.append("Could not find subscriptionOfferDetails for product: ");
   var19.append(var25);
   throw new AssertionError(var19.toString());
}
