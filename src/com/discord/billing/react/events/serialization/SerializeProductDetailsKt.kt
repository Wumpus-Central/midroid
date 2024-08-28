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

      var var2: Long;
      var var11: ArrayList;
      var var23: java.lang.String;
      var var27: java.lang.String;
      label60: {
         var10 = var9.next() as ProductDetails;
         var11 = new ArrayList();
         val var4: Boolean = r.c(var10.e(), "inapp");
         var23 = null;
         if (var4) {
            val var13: a = var10.c();
            if (var13 == null) {
               var23 = var10.d();
               val var15: StringBuilder = new StringBuilder();
               var15.append("Could not find oneTimePurchaseOfferDetails for product: ");
               var15.append(var23);
               throw new AssertionError(var15.toString());
            }

            r.g(var13, "productDetails.oneTimePu…oductDetails.productId}\")");
            var2 = var13.b();
            var27 = var13.a();
            var23 = var13.c();
            var14 = null;
         } else {
            if (!r.c(var10.e(), "subs")) {
               var2 = 0L;
               var27 = null;
               var14 = null;
               var23 = null;
               break label60;
            }

            val var28: java.util.List = var10.f();
            if (var28 == null) {
               break;
            }

            val var26: java.util.Iterator = var28.iterator();

            val var1: Boolean;
            do {
               var16 = var23;
               if (!var26.hasNext()) {
                  break;
               }

               var16 = var26.next();
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

            var2 = var22.d();
            var27 = var22.c();
            var14 = var22.b();
            var23 = var22.e();
            val var29: java.util.Iterator = var28.iterator();

            while (var29.hasNext()) {
               val var12: java.lang.String = (var29.next() as c).b();
               if (var12 != null) {
                  var11.add(var12);
               }
            }
         }

         var27 = var23;
         var23 = var27;
      }

      var8.add(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               w.a("identifier", var10.d()),
               w.a("title", var10.g()),
               w.a("description", var10.a()),
               w.a("priceString", var23),
               w.a("currencyCode", var27),
               w.a("price", (int)(var2 / (long)10000)),
               w.a("type", var10.e()),
               w.a("offerIds", NativeArrayExtensionsKt.toNativeArray(var11)),
               w.a("billingPeriod", var14)
            }
         )
      );
   }

   val var25: java.lang.String = var10.d();
   val var19: StringBuilder = new StringBuilder();
   var19.append("Could not find subscriptionOfferDetails for product: ");
   var19.append(var25);
   throw new AssertionError(var19.toString());
}
