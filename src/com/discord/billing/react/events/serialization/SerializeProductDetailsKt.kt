package com.discord.billing.react.events.serialization

import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.ProductDetails.PricingPhase
import com.android.billingclient.api.ProductDetails.a
import com.android.billingclient.api.ProductDetails.c
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import eh.w
import java.util.ArrayList
import kotlin.jvm.internal.r

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   r.h(var0, "<this>");
   val var8: ArrayList = new ArrayList(h.t(var0, 10));
   val var9: java.util.Iterator = var0.iterator();

   val var10: ProductDetails;
   while (true) {
      if (!var9.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray(var8);
      }

      var var3: Long;
      var var11: ArrayList;
      var var23: java.lang.String;
      var var28: java.lang.String;
      label60: {
         var10 = var9.next() as ProductDetails;
         var11 = new ArrayList();
         val var2: Boolean = r.c(var10.e(), "inapp");
         var23 = null;
         if (var2) {
            val var13: a = var10.c();
            if (var13 == null) {
               val var15: java.lang.String = var10.d();
               val var21: StringBuilder = new StringBuilder();
               var21.append("Could not find oneTimePurchaseOfferDetails for product: ");
               var21.append(var15);
               throw new AssertionError(var21.toString());
            }

            r.g(var13, "productDetails.oneTimePu…oductDetails.productId}\")");
            var3 = var13.b();
            var28 = var13.a();
            var23 = var13.c();
            var14 = null;
         } else {
            if (!r.c(var10.e(), "subs")) {
               var3 = 0L;
               var14 = null;
               var23 = null;
               var28 = null;
               break label60;
            }

            val var7: java.util.List = var10.f();
            if (var7 == null) {
               break;
            }

            val var27: java.util.Iterator = var7.iterator();

            val var1: Boolean;
            do {
               var16 = var23;
               if (!var27.hasNext()) {
                  break;
               }

               var16 = var27.next();
               if ((var16 as c).b() == null) {
                  var1 = true;
               } else {
                  var1 = false;
               }
            } while (!var1);

            val var17: c = var16 as c;
            if (var16 as c == null) {
               break;
            }

            val var22: PricingPhase = var17.e().a().get(0) as PricingPhase;
            if (var22 == null) {
               var23 = var10.d();
               val var18: StringBuilder = new StringBuilder();
               var18.append("Could not find pricingPhase for product: ");
               var18.append(var23);
               throw new AssertionError(var18.toString());
            }

            var3 = var22.d();
            var28 = var22.c();
            var14 = var22.b();
            var23 = var22.e();
            val var29: java.util.Iterator = var7.iterator();

            while (var29.hasNext()) {
               val var12: java.lang.String = (var29.next() as c).b();
               if (var12 != null) {
                  var11.add(var12);
               }
            }
         }

         var28 = var23;
         var23 = var28;
      }

      var8.add(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               w.a("identifier", var10.d()),
               w.a("title", var10.g()),
               w.a("description", var10.a()),
               w.a("priceString", var23),
               w.a("currencyCode", var28),
               w.a("price", (int)(var3 / (long)10000)),
               w.a("type", var10.e()),
               w.a("offerIds", NativeArrayExtensionsKt.toNativeArray(var11)),
               w.a("billingPeriod", var14)
            }
         )
      );
   }

   val var19: java.lang.String = var10.d();
   val var25: StringBuilder = new StringBuilder();
   var25.append("Could not find subscriptionOfferDetails for product: ");
   var25.append(var19);
   throw new AssertionError(var25.toString());
}
