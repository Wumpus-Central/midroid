package com.discord.billing.react.events.serialization

import com.android.billingclient.api.SkuDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import java.util.ArrayList
import kotlin.jvm.internal.q
import lj.w

internal fun List<SkuDetails>.serializeSkuDetails(): ReadableNativeArray {
   q.h(var0, "<this>");
   val var1: java.lang.Iterable = var0;
   val var3: ArrayList = new ArrayList(i.u(var0, 10));

   for (SkuDetails var2 : var1) {
      var3.add(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               w.a("identifier", var2.e()),
               w.a("title", var2.g()),
               w.a("description", var2.a()),
               w.a("priceString", var2.b()),
               w.a("currencyCode", var2.d()),
               w.a("price", (int)(var2.c() / (long)10000)),
               w.a("type", var2.h())
            }
         )
      );
   }

   return NativeArrayExtensionsKt.toNativeArray(var3);
}
