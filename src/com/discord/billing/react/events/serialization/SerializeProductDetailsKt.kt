package com.discord.billing.react.events.serialization

import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.q
import nh.w

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   q.h(var0, "<this>");
   val var7: ArrayList = new ArrayList(i.v(var0, 10));
   val var8: java.util.Iterator = var0.iterator();

   val var9: ProductDetails;
   while (true) {
      if (!var8.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray(var7);
      }

      var var2: Long;
      var var10: ArrayList;
      var var22: java.lang.String;
      var var26: java.lang.String;
      label55: {
         var9 = var8.next() as ProductDetails;
         var10 = new ArrayList();
         val var1: Boolean = q.c(var9.e(), "inapp");
         var22 = null;
         if (var1) {
            val var12: ProductDetails.a = var9.c();
            if (var12 == null) {
               val var14: java.lang.String = var9.d();
               val var20: StringBuilder = new StringBuilder();
               var20.append("Could not find oneTimePurchaseOfferDetails for product: ");
               var20.append(var14);
               throw new AssertionError(var20.toString());
            }

            q.e(var12);
            var2 = var12.b();
            var26 = var12.a();
            var22 = var12.c();
            var13 = null;
         } else {
            if (!q.c(var9.e(), "subs")) {
               var2 = 0L;
               var26 = null;
               var13 = null;
               var22 = null;
               break label55;
            }

            val var27: java.util.List = var9.f();
            if (var27 == null) {
               break;
            }

            val var25: java.util.Iterator = var27.iterator();

            do {
               var15 = var22;
               if (!var25.hasNext()) {
                  break;
               }

               var15 = var25.next();
            } while (((ProductDetails.c)var15).b() != null);

            val var16: ProductDetails.c = var15 as ProductDetails.c;
            if (var15 as ProductDetails.c == null) {
               break;
            }

            val var21: ProductDetails.PricingPhase = var16.e().a().get(0) as ProductDetails.PricingPhase;
            if (var21 == null) {
               val var17: java.lang.String = var9.d();
               val var23: StringBuilder = new StringBuilder();
               var23.append("Could not find pricingPhase for product: ");
               var23.append(var17);
               throw new AssertionError(var23.toString());
            }

            var2 = var21.d();
            var26 = var21.c();
            var13 = var21.b();
            var22 = var21.e();
            val var28: java.util.Iterator = var27.iterator();

            while (var28.hasNext()) {
               val var11: java.lang.String = (var28.next() as ProductDetails.c).b();
               if (var11 != null) {
                  var10.add(var11);
               }
            }
         }

         var26 = var22;
         var22 = var26;
      }

      var7.add(
         NativeMapExtensionsKt.nativeMapOf(
            w.a("identifier", var9.d()),
            w.a("title", var9.g()),
            w.a("description", var9.a()),
            w.a("priceString", var22),
            w.a("currencyCode", var26),
            w.a("price", (int)(var2 / (long)10000)),
            w.a("type", var9.e()),
            w.a("offerIds", NativeArrayExtensionsKt.toNativeArray(var10)),
            w.a("billingPeriod", var13)
         )
      );
   }

   val var24: java.lang.String = var9.d();
   val var18: StringBuilder = new StringBuilder();
   var18.append("Could not find subscriptionOfferDetails for product: ");
   var18.append(var24);
   throw new AssertionError(var18.toString());
}
