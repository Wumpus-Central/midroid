package com.discord.billing

import com.discord.billing.react.events.BillingManagerConnectionStateUpdated
import com.discord.billing.react.events.BillingManagerPurchaseStateUpdated
import com.discord.billing.react.events.BillingManagerPurchaseUpdated
import com.discord.billing.types.ProductType
import com.discord.client_info.ClientInfo
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import java.util.ArrayList
import kotlin.jvm.internal.G

public class BillingManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val billingManager: BillingManager

   init {
      kotlin.jvm.internal.q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         s9.s.a("billing-manager-connection-state-updated", G.b(BillingManagerConnectionStateUpdated.class)),
         s9.s.a("billing-manager-purchase-updated", G.b(BillingManagerPurchaseUpdated.class)),
         s9.s.a("billing-manager-purchase-state-updated", G.b(BillingManagerPurchaseStateUpdated.class))
      );
      this.billingManager = new BillingManager(ClientInfo.INSTANCE.isProdBuild(), new n(this), new o(this), new p(this));
   }

   @JvmStatic
   fun `billingManager$lambda$0`(var0: BillingManagerModule, var1: Int): Unit {
      var0.emitEvent(new BillingManagerConnectionStateUpdated(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `billingManager$lambda$1`(var0: BillingManagerModule, var1: Int): Unit {
      var0.emitEvent(new BillingManagerPurchaseStateUpdated(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `billingManager$lambda$2`(var0: BillingManagerModule, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
      kotlin.jvm.internal.q.h(var1, "purchaseToken");
      kotlin.jvm.internal.q.h(var2, "packageName");
      kotlin.jvm.internal.q.h(var3, "product");
      var0.emitEvent(new BillingManagerPurchaseUpdated(var1, var2, var3));
      return Unit.a;
   }

   @JvmStatic
   fun `consumePurchase$lambda$7`(var0: Promise): Unit {
      var0.resolve(java.lang.Boolean.TRUE);
      return Unit.a;
   }

   @JvmStatic
   fun `consumePurchase$lambda$8`(var0: Promise, var1: BillingManagerException): Unit {
      kotlin.jvm.internal.q.h(var1, "e");
      var0.reject(var1.getErrorCode(), var1.getReason(), var1);
      return Unit.a;
   }

   private fun emitEvent(event: ReactEvent) {
      this.reactEvents.emitModuleEvent(this.reactContext, var1);
   }

   private fun BillingManager.getProducts(productIds: ReadableArray, productType: ProductType, promise: Promise) {
      val var5: ArrayList = var2.toArrayList();
      val var7: ArrayList = new ArrayList();

      for (Object var6 : var5) {
         if (var6 is java.lang.String) {
            var7.add(var6);
         }
      }

      val var10: j = new j(var4);
      val var9: ReactApplicationContext = this.getReactApplicationContext();
      kotlin.jvm.internal.q.g(var9, "getReactApplicationContext(...)");
      var1.getProducts(var7, var3, var4, var10, var9);
   }

   @JvmStatic
   fun `getProducts$lambda$11`(var0: Promise, var1: BillingManagerException): Unit {
      kotlin.jvm.internal.q.h(var1, "e");
      var0.reject(var1.getErrorCode(), var1.getReason(), var1);
      return Unit.a;
   }

   @JvmStatic
   fun `loadPurchases$lambda$10`(var0: Promise, var1: Exception): Unit {
      kotlin.jvm.internal.q.h(var1, "e");
      var0.reject(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `loadPurchases$lambda$9`(var0: Promise): Unit {
      var0.resolve(java.lang.Boolean.TRUE);
      return Unit.a;
   }

   @JvmStatic
   fun `purchase$lambda$3`(var0: Promise): Unit {
      var0.resolve(java.lang.Boolean.TRUE);
      return Unit.a;
   }

   @JvmStatic
   fun `purchase$lambda$4`(var0: Promise, var1: BillingManagerException): Unit {
      kotlin.jvm.internal.q.h(var1, "e");
      var0.reject(var1.getErrorCode(), var1.getReason(), var1);
      return Unit.a;
   }

   @JvmStatic
   fun `subscribe$lambda$5`(var0: Promise): Unit {
      var0.resolve(java.lang.Boolean.TRUE);
      return Unit.a;
   }

   @JvmStatic
   fun `subscribe$lambda$6`(var0: Promise, var1: BillingManagerException): Unit {
      kotlin.jvm.internal.q.h(var1, "e");
      var0.reject(var1.getErrorCode(), var1.getReason(), var1);
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      kotlin.jvm.internal.q.h(var1, "type");
   }

   @ReactMethod
   public fun close() {
      this.billingManager.close();
   }

   @ReactMethod
   public fun consumePurchase(purchaseToken: String, promise: Promise) {
      kotlin.jvm.internal.q.h(var1, "purchaseToken");
      kotlin.jvm.internal.q.h(var2, "promise");
      this.billingManager.consumePurchase(var1, new l(var2), new m(var2));
   }

   @ReactMethod
   public fun getIAPSkus(productIds: ReadableArray, promise: Promise) {
      kotlin.jvm.internal.q.h(var1, "productIds");
      kotlin.jvm.internal.q.h(var2, "promise");
      this.getProducts(this.billingManager, var1, ProductType.IAP, var2);
   }

   public open fun getName(): String {
      return "BillingManager";
   }

   @ReactMethod
   public fun getSubscriptionSkus(productIds: ReadableArray, promise: Promise) {
      kotlin.jvm.internal.q.h(var1, "productIds");
      kotlin.jvm.internal.q.h(var2, "promise");
      this.getProducts(this.billingManager, var1, ProductType.SUBSCRIPTIONS, var2);
   }

   @ReactMethod
   public fun loadPurchases(promise: Promise) {
      kotlin.jvm.internal.q.h(var1, "promise");
      this.billingManager.loadPurchases(new s(var1), new i(var1));
   }

   @ReactMethod
   public fun open() {
      val var1: BillingManager = this.billingManager;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      kotlin.jvm.internal.q.g(var2, "getReactApplicationContext(...)");
      var1.open(var2);
   }

   @ReactMethod
   public fun purchase(productId: String, userId: String, promise: Promise) {
      kotlin.jvm.internal.q.h(var1, "productId");
      kotlin.jvm.internal.q.h(var2, "userId");
      kotlin.jvm.internal.q.h(var3, "promise");
      BillingManager.purchase$default(
         this.billingManager, this.getCurrentActivity(), var1, ProductType.IAP, var2, null, null, null, new q(var3), new r(var3), 112, null
      );
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun subscribe(productId: String, userId: String, oldProductId: String?, purchaseToken: String?, offerId: String?, promise: Promise) {
      kotlin.jvm.internal.q.h(var1, "productId");
      kotlin.jvm.internal.q.h(var2, "userId");
      kotlin.jvm.internal.q.h(var6, "promise");
      this.billingManager.purchase(this.getCurrentActivity(), var1, ProductType.SUBSCRIPTIONS, var2, var3, var4, var5, new h(var6), new k(var6));
   }
}
