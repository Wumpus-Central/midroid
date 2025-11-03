package com.discord.billing.react.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import ht.v
import kotlinx.serialization.KSerializer
import xu.m

@m
internal class BillingManagerPurchaseUpdated(purchaseToken: String, packageName: String, sku: String) : ReactEvent {
   private final val purchaseToken: String
   private final val packageName: String
   private final val sku: String

   init {
      super();
      this.purchaseToken = var1;
      this.packageName = var2;
      this.sku = var3;
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            v.a(
               "purchase",
               NativeMapExtensionsKt.nativeMapOf(
                  new Pair[]{v.a("purchaseToken", this.purchaseToken), v.a("packageName", this.packageName), v.a("productId", this.sku)}
               )
            )
         }
      );
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerPurchaseUpdated> {
         return BillingManagerPurchaseUpdated.$serializer.INSTANCE;
      }
   }
}
