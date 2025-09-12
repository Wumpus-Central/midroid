@file:SourceDebugExtension(["SMAP\nSerializeProductDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializeProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeProductDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1557#2:56\n1628#2,2:57\n295#2,2:59\n1630#2:61\n*S KotlinDebug\n*F\n+ 1 SerializeProductDetails.kt\ncom/discord/billing/react/events/serialization/SerializeProductDetailsKt\n*L\n8#1:56\n8#1:57,2\n24#1:59,2\n8#1:61\n*E\n"])

package com.discord.billing.react.events.serialization

import Ca.v
import com.android.billingclient.api.ProductDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

internal fun List<ProductDetails>.serializeProductDetails(): ReadableNativeArray {
   val var5: ArrayList = new ArrayList(CollectionsKt.v(var0, 10));
   val var8: java.util.Iterator = var0.iterator();

   val var6: ProductDetails;
   while (true) {
      if (!var8.hasNext()) {
         return NativeArrayExtensionsKt.toNativeArray$default(var5, null, 1, null);
      }

      var6 = var8.next() as ProductDetails;
      val var7: ArrayList = new ArrayList();
      val var1: Long;
      val var3: java.lang.String;
      val var4: java.lang.String;
      val var12: java.lang.String;
      if (var6.e() == "inapp") {
         val var11: ProductDetails.b = var6.c();
         if (var11 == null) {
            val var13: java.lang.String = var6.d();
            val var19: StringBuilder = new StringBuilder();
            var19.append("Could not find oneTimePurchaseOfferDetails for product: ");
            var19.append(var13);
            throw new AssertionError(var19.toString());
         }

         var1 = var11.b();
         var3 = var11.a();
         var12 = var11.c();
         var4 = null;
      } else if (var6.e() == "subs") {
         val var9: java.util.List = var6.f();
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
            val var17: java.lang.String = var6.d();
            val var21: StringBuilder = new StringBuilder();
            var21.append("Could not find pricingPhase for product: ");
            var21.append(var17);
            throw new AssertionError(var21.toString());
         }

         var1 = var16.d();
         var3 = var16.c();
         var4 = var16.b();
         var12 = var16.e();
         val var10: java.util.Iterator = var9.iterator();

         while (var10.hasNext()) {
            val var23: java.lang.String = (var10.next() as ProductDetails.d).b();
            if (var23 != null) {
               var7.add(var23);
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
            new Pair[]{
               v.a("identifier", var6.d()),
               v.a("title", var6.g()),
               v.a("description", var6.a()),
               v.a("priceString", var3),
               v.a("currencyCode", var12),
               v.a("price", (int)(var1 / (long)10000)),
               v.a("type", var6.e()),
               v.a("offerIds", NativeArrayExtensionsKt.toNativeArray$default(var7, null, 1, null)),
               v.a("billingPeriod", var4)
            }
         )
      );
   }

   val var22: java.lang.String = var6.d();
   val var18: StringBuilder = new StringBuilder();
   var18.append("Could not find subscriptionOfferDetails for product: ");
   var18.append(var22);
   throw new AssertionError(var18.toString());
}
