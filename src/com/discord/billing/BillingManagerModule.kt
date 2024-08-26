package com.discord.billing

import com.discord.billing.react.events.BillingManagerConnectionStateUpdated
import com.discord.billing.react.events.BillingManagerDowngradeCommand
import com.discord.billing.react.events.BillingManagerPurchaseStateUpdated
import com.discord.billing.react.events.BillingManagerPurchaseUpdated
import com.discord.billing.types.SkuType
import com.discord.client_info.ClientInfo
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import eh.w
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

public class BillingManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val billingManager: BillingManager
   public final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         new Pair[]{
            w.a("billing-manager-connection-state-updated", h0.b(BillingManagerConnectionStateUpdated.class)),
            w.a("billing-manager-purchase-updated", h0.b(BillingManagerPurchaseUpdated.class)),
            w.a("billing-manager-downgrade-command", h0.b(BillingManagerDowngradeCommand.class)),
            w.a("billing-manager-purchase-state-updated", h0.b(BillingManagerPurchaseStateUpdated.class))
         }
      );
      this.billingManager = new BillingManager(ClientInfo.INSTANCE.isProdBuild(), new Function1<Integer, Unit>(this) {
         final BillingManagerModule this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(int var1) {
            BillingManagerModule.access$emitEvent(this.this$0, new BillingManagerConnectionStateUpdated(var1));
         }
      }, new Function1<Integer, Unit>(this) {
         final BillingManagerModule this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(int var1) {
            BillingManagerModule.access$emitEvent(this.this$0, new BillingManagerPurchaseStateUpdated(var1));
         }
      }, new Function3<java.lang.String, java.lang.String, java.lang.String, Unit>(this) {
         final BillingManagerModule this$0;

         {
            super(3);
            this.this$0 = var1;
         }

         public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
            r.h(var1, "purchaseToken");
            r.h(var2, "packageName");
            r.h(var3, "sku");
            BillingManagerModule.access$emitEvent(this.this$0, new BillingManagerPurchaseUpdated(var1, var2, var3));
         }
      }, new Function1<Integer, Unit>(this) {
         final BillingManagerModule this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(int var1) {
            BillingManagerModule.access$emitEvent(this.this$0, new BillingManagerDowngradeCommand(var1));
         }
      });
   }

   private fun emitEvent(event: ReactEvent) {
      this.reactEvents.emitModuleEvent(this.reactContext, var1);
   }

   private fun BillingManager.getSkus(skuIds: ReadableArray, skuType: SkuType, promise: Promise) {
      val var5: ArrayList = var2.toArrayList();
      r.g(var5, "skuIds.toArrayList()");
      val var7: ArrayList = new ArrayList();

      for (var5 : var5) {
         if (var5 is java.lang.String) {
            var7.add(var5);
         }
      }

      val var9: Function1 = new Function1<BillingManagerException, Unit>(var4) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            r.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      };
      val var10: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var10, "reactApplicationContext");
      var1.getSkus(var7, var3, var4, var9, var10);
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
   }

   @ReactMethod
   public fun close() {
      this.billingManager.close();
   }

   @ReactMethod
   public fun consumePurchase(purchaseToken: String, promise: Promise) {
      r.h(var1, "purchaseToken");
      r.h(var2, "promise");
      this.billingManager.consumePurchase(var1, new Function0<Unit>(var2) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1<BillingManagerException, Unit>(var2) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            r.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      });
   }

   @ReactMethod
   public fun getIAPSkus(skuIds: ReadableArray, promise: Promise) {
      r.h(var1, "skuIds");
      r.h(var2, "promise");
      this.getSkus(this.billingManager, var1, SkuType.IAP, var2);
   }

   public open fun getName(): String {
      return "BillingManager";
   }

   @ReactMethod
   public fun getSubscriptionSkus(skuIds: ReadableArray, promise: Promise) {
      r.h(var1, "skuIds");
      r.h(var2, "promise");
      this.getSkus(this.billingManager, var1, SkuType.SUBSCRIPTIONS, var2);
   }

   @ReactMethod
   public fun loadPurchases(promise: Promise) {
      r.h(var1, "promise");
      this.billingManager.loadPurchases(new Function0<Unit>(var1) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1<Exception, Unit>(var1) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(Exception var1) {
            r.h(var1, "e");
            this.$promise.reject(var1);
         }
      });
   }

   @ReactMethod
   public fun open() {
      val var1: BillingManager = this.billingManager;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      var1.open(var2);
   }

   @ReactMethod
   public fun purchase(skuId: String, userId: String, promise: Promise) {
      r.h(var1, "skuId");
      r.h(var2, "userId");
      r.h(var3, "promise");
      BillingManager.purchase$default(this.billingManager, this.getCurrentActivity(), var1, SkuType.IAP, var2, null, null, null, new Function0<Unit>(var3) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1<BillingManagerException, Unit>(var3) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            r.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      }, 112, null);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun subscribe(skuId: String, userId: String, oldSkuId: String?, purchaseToken: String?, offerId: String?, promise: Promise) {
      r.h(var1, "skuId");
      r.h(var2, "userId");
      r.h(var6, "promise");
      this.billingManager.purchase(this.getCurrentActivity(), var1, SkuType.SUBSCRIPTIONS, var2, var3, var4, var5, new Function0<Unit>(var6) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1<BillingManagerException, Unit>(var6) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            r.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      });
   }
}
