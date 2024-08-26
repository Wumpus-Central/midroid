package com.discord.billing.react.events.serialization

import com.android.billingclient.api.SkuDetails
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableNativeArray
import eh.w
import java.util.ArrayList
import kotlin.jvm.internal.r

internal fun List<SkuDetails>.serializeSkuDetails(): ReadableNativeArray {
   r.h(var0, "<this>");
   val var1: ArrayList = new ArrayList(h.t(var0, 10));

   for (SkuDetails var3 : var0) {
      var1.add(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               w.a("identifier", var3.e()),
               w.a("title", var3.g()),
               w.a("description", var3.a()),
               w.a("priceString", var3.b()),
               w.a("currencyCode", var3.d()),
               w.a("price", (int)(var3.c() / (long)10000)),
               w.a("type", var3.h())
            }
         )
      );
   }

   return NativeArrayExtensionsKt.toNativeArray(var1);
}
