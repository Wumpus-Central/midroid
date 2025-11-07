@file:SourceDebugExtension(["SMAP\nSerializeProductDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializeProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeProductDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1557#2:76\n1628#2,2:77\n295#2,2:79\n1557#2:81\n1628#2,3:82\n1630#2:85\n*S KotlinDebug\n*F\n+ 1 SerializeProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeProductDetailsKt\n*L\n9#1:76\n9#1:77,2\n26#1:79,2\n41#1:81\n41#1:82,3\n9#1:85\n*E\n"])

package com.discord.billing.react.events.serialization

import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import ht.v
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   val var9: ArrayList = new ArrayList(CollectionsKt.w(var0, 10));
   val var17: java.util.Iterator = var0.iterator();

   val var3: ProductDetails;
   while (true) {
      if (!var17.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray$default(var9, null, 1, null);
      }

      var3 = var17.next() as ProductDetails;
      val var11: ArrayList = new ArrayList();
      val var10: ArrayList = new ArrayList();
      val var1: Long;
      val var5: java.lang.String;
      val var6: ProductDetails;
      val var21: java.lang.String;
      var var25: java.lang.String;
      if (var3.e() == "inapp") {
         val var4: ProductDetails.b = var3.c();
         if (var4 == null) {
            val var18: java.lang.String = var3.d();
            val var22: StringBuilder = new StringBuilder();
            var22.append("Could not find oneTimePurchaseOfferDetails for product: ");
            var22.append(var18);
            throw new AssertionError(var22.toString());
         }

         var1 = var4.b();
         var5 = var4.a();
         var25 = var4.c();
         var6 = var3;
         var21 = null;
      } else if (var3.e() == "subs") {
         val var29: java.util.List = var3.f();
         if (var29 == null) {
            break;
         }

         val var33: java.util.Iterator = var29.iterator();

         do {
            if (!var33.hasNext()) {
               var25 = null;
               break;
            }

            var25 = (java.lang.String)var33.next();
         } while (((ProductDetails.d)var25).b() != null);

         val var27: ProductDetails.d = var25 as ProductDetails.d;
         if (var25 as ProductDetails.d == null) {
            break;
         }

         val var28: ProductDetails.PricingPhase = var27.e().a().get(0) as ProductDetails.PricingPhase;
         if (var28 == null) {
            val var23: java.lang.String = var3.d();
            val var19: StringBuilder = new StringBuilder();
            var19.append("Could not find pricingPhase for product: ");
            var19.append(var23);
            throw new AssertionError(var19.toString());
         }

         var1 = var28.d();
         val var8: java.lang.String = var28.c();
         val var7: java.lang.String = var28.b();
         var25 = var28.e();

         for (ProductDetails.d var13 : var29) {
            val var12: java.lang.String = var13.b();
            if (var12 != null) {
               var11.add(var12);
               val var30: java.util.List = var13.e().a();
               val var31: java.lang.Iterable = var30;
               val var14: ArrayList = new ArrayList(CollectionsKt.w(var30, 10));

               for (ProductDetails.PricingPhase var15 : var31) {
                  var14.add(
                     NativeMapExtensionsKt.nativeMapOf(
                        new Pair[]{
                           v.a("price", (int)(var15.d() / (long)10000)),
                           v.a("formattedPrice", var15.c()),
                           v.a("billingPeriod", var15.b()),
                           v.a("billingCycleCount", var15.a()),
                           v.a("currencyCode", var15.e())
                        }
                     )
                  );
               }

               var10.add(
                  NativeMapExtensionsKt.nativeMapOf(
                     new Pair[]{
                        v.a("basePlanId", var13.a()),
                        v.a("offerId", var12),
                        v.a("pricingPhases", NativeArrayExtensionsKt.toNativeArray$default(var14, null, 1, null))
                     }
                  )
               );
            }
         }

         var6 = var3;
         var5 = var8;
         var21 = var7;
      } else {
         var1 = 0L;
         var25 = null;
         var5 = null;
         var6 = var3;
         var21 = null;
      }

      var9.add(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               v.a("identifier", var6.d()),
               v.a("title", var6.g()),
               v.a("description", var6.a()),
               v.a("priceString", var5),
               v.a("currencyCode", var25),
               v.a("price", (int)(var1 / (long)10000)),
               v.a("type", var6.e()),
               v.a("offerIds", NativeArrayExtensionsKt.toNativeArray$default(var11, null, 1, null)),
               v.a("billingPeriod", var21),
               v.a("subscriptionOffers", NativeArrayExtensionsKt.toNativeArray$default(var10, null, 1, null))
            }
         )
      );
   }

   val var20: java.lang.String = var3.d();
   val var24: StringBuilder = new StringBuilder();
   var24.append("Could not find subscriptionOfferDetails for product: ");
   var24.append(var20);
   throw new AssertionError(var24.toString());
}
