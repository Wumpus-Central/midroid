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
import kotlin.jvm.internal.SourceDebugExtension
import xa.v

@SourceDebugExtension(["SMAP\nBillingManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingManagerModule.kt\ncom/discord/billing/BillingManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n808#2,11:160\n*S KotlinDebug\n*F\n+ 1 BillingManagerModule.kt\ncom/discord/billing/BillingManagerModule\n*L\n150#1:160,11\n*E\n"])
public class BillingManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val billingManager: BillingManager

   init {
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         new Pair[]{
            v.a("billing-manager-connection-state-updated", BillingManagerConnectionStateUpdated::class),
            v.a("billing-manager-purchase-updated", BillingManagerPurchaseUpdated::class),
            v.a("billing-manager-purchase-state-updated", BillingManagerPurchaseStateUpdated::class)
         }
      );
      var1 = this.getReactApplicationContext();
      this.billingManager = new BillingManager(var1, ClientInfo.INSTANCE.isProdBuild(), new n(this), new o(this), new p(this));
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
      var0.reject(var1.getErrorCode(), var1.getReason(), var1);
      return Unit.a;
   }

   private fun emitEvent(event: ReactEvent) {
      this.reactEvents.emitModuleEvent(this.reactContext, var1);
   }

   private fun BillingManager.getProducts(productIds: ReadableArray, productType: ProductType, promise: Promise) {
      val var5: ArrayList = var2.toArrayList();
      val var7: ArrayList = new ArrayList();

      for (var5 : var5) {
         if (var5 is java.lang.String) {
            var7.add(var5);
         }
      }

      var1.getProducts(var7, var3, var4, new j(var4));
   }

   @JvmStatic
   fun `getProducts$lambda$11`(var0: Promise, var1: BillingManagerException): Unit {
      var0.reject(var1.getErrorCode(), var1.getReason(), var1);
      return Unit.a;
   }

   @JvmStatic
   fun `loadPurchases$lambda$10`(var0: Promise, var1: Exception): Unit {
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
      var0.reject(var1.getErrorCode(), var1.getReason(), var1);
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
   }

   @ReactMethod
   public fun close() {
      this.billingManager.close();
   }

   @ReactMethod
   public fun consumePurchase(purchaseToken: String, promise: Promise) {
      this.billingManager.consumePurchase(var1, new l(var2), new m(var2));
   }

   @ReactMethod
   public fun getIAPSkus(productIds: ReadableArray, promise: Promise) {
      this.getProducts(this.billingManager, var1, ProductType.IAP, var2);
   }

   public open fun getName(): String {
      return "BillingManager";
   }

   @ReactMethod
   public fun getSubscriptionSkus(productIds: ReadableArray, promise: Promise) {
      this.getProducts(this.billingManager, var1, ProductType.SUBSCRIPTIONS, var2);
   }

   @ReactMethod
   public fun loadPurchases(promise: Promise) {
      this.billingManager.loadPurchases(new s(var1), new i(var1));
   }

   @ReactMethod
   public fun open() {
      this.billingManager.open();
   }

   @ReactMethod
   public fun purchase(productId: String, userId: String, promise: Promise) {
      BillingManager.purchase$default(
         this.billingManager, this.reactContext.getCurrentActivity(), var1, ProductType.IAP, var2, null, null, null, new q(var3), new r(var3), 112, null
      );
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun subscribe(productId: String, userId: String, oldProductId: String?, purchaseToken: String?, offerId: String?, promise: Promise) {
      this.billingManager.purchase(this.reactContext.getCurrentActivity(), var1, ProductType.SUBSCRIPTIONS, var2, var3, var4, var5, new h(var6), new k(var6));
   }
}
