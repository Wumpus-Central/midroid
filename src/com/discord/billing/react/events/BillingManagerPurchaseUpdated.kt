package com.discord.billing.react.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import r9.s

@f
internal class BillingManagerPurchaseUpdated(purchaseToken: String, packageName: String, sku: String) : ReactEvent {
   private final val purchaseToken: String
   private final val packageName: String
   private final val sku: String

   init {
      q.h(var1, "purchaseToken");
      q.h(var2, "packageName");
      q.h(var3, "sku");
      super();
      this.purchaseToken = var1;
      this.packageName = var2;
      this.sku = var3;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a(
            "purchase",
            NativeMapExtensionsKt.nativeMapOf(s.a("purchaseToken", this.purchaseToken), s.a("packageName", this.packageName), s.a("productId", this.sku))
         )
      );
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerPurchaseUpdated> {
         return BillingManagerPurchaseUpdated.$serializer.INSTANCE;
      }
   }
}
