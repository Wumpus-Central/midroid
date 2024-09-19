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
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import nh.w

public class BillingManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val billingManager: BillingManager
   public final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         w.a("billing-manager-connection-state-updated", g0.b(BillingManagerConnectionStateUpdated.class)),
         w.a("billing-manager-purchase-updated", g0.b(BillingManagerPurchaseUpdated.class)),
         w.a("billing-manager-downgrade-command", g0.b(BillingManagerDowngradeCommand.class)),
         w.a("billing-manager-purchase-state-updated", g0.b(BillingManagerPurchaseStateUpdated.class))
      );
      this.billingManager = new BillingManager(ClientInfo.INSTANCE.isProdBuild(), new Function1(this) {
         final BillingManagerModule this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(int var1) {
            BillingManagerModule.access$emitEvent(this.this$0, new BillingManagerConnectionStateUpdated(var1));
         }
      }, new Function1(this) {
         final BillingManagerModule this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(int var1) {
            BillingManagerModule.access$emitEvent(this.this$0, new BillingManagerPurchaseStateUpdated(var1));
         }
      }, new Function3(this) {
         final BillingManagerModule this$0;

         {
            super(3);
            this.this$0 = var1;
         }

         public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
            q.h(var1, "purchaseToken");
            q.h(var2, "packageName");
            q.h(var3, "sku");
            BillingManagerModule.access$emitEvent(this.this$0, new BillingManagerPurchaseUpdated(var1, var2, var3));
         }
      }, new Function1(this) {
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
      q.g(var5, "toArrayList(...)");
      val var7: ArrayList = new ArrayList();

      for (var5 : var5) {
         if (var5 is java.lang.String) {
            var7.add(var5);
         }
      }

      val var10: Function1 = new Function1(var4) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            q.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      };
      val var9: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var9, "getReactApplicationContext(...)");
      var1.getSkus(var7, var3, var4, var10, var9);
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
   }

   @ReactMethod
   public fun close() {
      this.billingManager.close();
   }

   @ReactMethod
   public fun consumePurchase(purchaseToken: String, promise: Promise) {
      q.h(var1, "purchaseToken");
      q.h(var2, "promise");
      this.billingManager.consumePurchase(var1, new Function0(var2) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1(var2) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            q.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      });
   }

   @ReactMethod
   public fun getIAPSkus(skuIds: ReadableArray, promise: Promise) {
      q.h(var1, "skuIds");
      q.h(var2, "promise");
      this.getSkus(this.billingManager, var1, SkuType.IAP, var2);
   }

   public open fun getName(): String {
      return "BillingManager";
   }

   @ReactMethod
   public fun getSubscriptionSkus(skuIds: ReadableArray, promise: Promise) {
      q.h(var1, "skuIds");
      q.h(var2, "promise");
      this.getSkus(this.billingManager, var1, SkuType.SUBSCRIPTIONS, var2);
   }

   @ReactMethod
   public fun loadPurchases(promise: Promise) {
      q.h(var1, "promise");
      this.billingManager.loadPurchases(new Function0(var1) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1(var1) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(Exception var1) {
            q.h(var1, "e");
            this.$promise.reject(var1);
         }
      });
   }

   @ReactMethod
   public fun open() {
      val var2: BillingManager = this.billingManager;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var1, "getReactApplicationContext(...)");
      var2.open(var1);
   }

   @ReactMethod
   public fun purchase(skuId: String, userId: String, promise: Promise) {
      q.h(var1, "skuId");
      q.h(var2, "userId");
      q.h(var3, "promise");
      BillingManager.purchase$default(this.billingManager, this.getCurrentActivity(), var1, SkuType.IAP, var2, null, null, null, new Function0(var3) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1(var3) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            q.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      }, 112, null);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun subscribe(skuId: String, userId: String, oldSkuId: String?, purchaseToken: String?, offerId: String?, promise: Promise) {
      q.h(var1, "skuId");
      q.h(var2, "userId");
      q.h(var6, "promise");
      this.billingManager.purchase(this.getCurrentActivity(), var1, SkuType.SUBSCRIPTIONS, var2, var3, var4, var5, new Function0(var6) {
         final Promise $promise;

         {
            super(0);
            this.$promise = var1;
         }

         public final void invoke() {
            this.$promise.resolve(java.lang.Boolean.TRUE);
         }
      }, new Function1(var6) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(BillingManagerException var1) {
            q.h(var1, "e");
            this.$promise.reject(var1.getErrorCode(), var1.getReason(), var1);
         }
      });
   }
}
