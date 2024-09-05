package com.discord.billing.react.events.serialization

import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.q
import vj.w

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   q.h(var0, "<this>");
   val var7: ArrayList = new ArrayList(i.u(var0, 10));
   val var9: java.util.Iterator = var0.iterator();

   val var10: ProductDetails;
   while (true) {
      if (!var9.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray(var7);
      }

      var var1: Long;
      var var8: ArrayList;
      var var22: java.lang.String;
      var var26: java.lang.String;
      label55: {
         var10 = var9.next() as ProductDetails;
         var8 = new ArrayList();
         val var3: Boolean = q.c(var10.e(), "inapp");
         var22 = null;
         if (var3) {
            val var12: ProductDetails.a = var10.c();
            if (var12 == null) {
               var22 = var10.d();
               val var14: StringBuilder = new StringBuilder();
               var14.append("Could not find oneTimePurchaseOfferDetails for product: ");
               var14.append(var22);
               throw new AssertionError(var14.toString());
            }

            q.e(var12);
            var1 = var12.b();
            var26 = var12.a();
            var22 = var12.c();
            var13 = null;
         } else {
            if (!q.c(var10.e(), "subs")) {
               var1 = 0L;
               var26 = null;
               var13 = null;
               var22 = null;
               break label55;
            }

            val var27: java.util.List = var10.f();
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
               val var17: java.lang.String = var10.d();
               val var23: StringBuilder = new StringBuilder();
               var23.append("Could not find pricingPhase for product: ");
               var23.append(var17);
               throw new AssertionError(var23.toString());
            }

            var1 = var21.d();
            var26 = var21.c();
            var13 = var21.b();
            var22 = var21.e();
            val var11: java.util.Iterator = var27.iterator();

            while (var11.hasNext()) {
               val var28: java.lang.String = (var11.next() as ProductDetails.c).b();
               if (var28 != null) {
                  var8.add(var28);
               }
            }
         }

         var26 = var22;
         var22 = var26;
      }

      var7.add(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               w.a("identifier", var10.d()),
               w.a("title", var10.g()),
               w.a("description", var10.a()),
               w.a("priceString", var22),
               w.a("currencyCode", var26),
               w.a("price", (int)(var1 / (long)10000)),
               w.a("type", var10.e()),
               w.a("offerIds", NativeArrayExtensionsKt.toNativeArray(var8)),
               w.a("billingPeriod", var13)
            }
         )
      );
   }

   val var18: java.lang.String = var10.d();
   val var24: StringBuilder = new StringBuilder();
   var24.append("Could not find subscriptionOfferDetails for product: ");
   var24.append(var18);
   throw new AssertionError(var24.toString());
}
