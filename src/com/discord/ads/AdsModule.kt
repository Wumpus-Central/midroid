package com.discord.ads

import com.discord.codegen.NativeAdsModuleSpec
import com.discord.logging.Log
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableNativeMap
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info
import com.google.common.util.concurrent.ListenableFuture
import com.google.common.util.concurrent.SettableFuture
import com.google.common.util.concurrent.c
import com.google.common.util.concurrent.d
import java.util.concurrent.CancellationException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicReference
import kotlin.jvm.internal.q
import z9.s

public class AdsModule(reactContext: ReactApplicationContext) : NativeAdsModuleSpec {
   private final val adExecutor: ExecutorService
   private final val currentOperation: AtomicReference<ListenableFuture<Info>>

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.adExecutor = Executors.newSingleThreadExecutor();
      this.currentOperation = new AtomicReference<>(null);
   }

   private fun cleanupCurrentOperation() {
      val var1: ListenableFuture = this.currentOperation.getAndSet(null);
      if (var1 != null) {
         if (!var1.isDone()) {
            Log.i$default(Log.INSTANCE, "AdsModule", "Stopping current google advertising ID operation", null, 4, null);
            var1.cancel(true);
         }
      }
   }

   private fun getAdvertisingIdInfoAsync(): ListenableFuture<Info> {
      val var1: SettableFuture = SettableFuture.z();
      this.adExecutor.execute(new a(var1, this));
      q.g(var1, "also(...)");
      return var1;
   }

   @JvmStatic
   fun `getAdvertisingIdInfoAsync$lambda$1$lambda$0`(var0: SettableFuture, var1: AdsModule) {
      try {
         var0.x(AdvertisingIdClient.a(var1.getReactApplicationContext()));
      } catch (var4: Exception) {
         val var3: java.lang.String = var4.getMessage();
         val var5: StringBuilder = new StringBuilder();
         var5.append("Error getting google advertising ID info: ");
         var5.append(var3);
         var0.y(new Exception(var5.toString(), var4));
      }
   }

   private fun resolveWithNullId(promise: Promise) {
      var1.resolve(NativeMapExtensionsKt.nativeMapOf(s.a("googleAdvertisingId", null), s.a("isLimitAdTrackingEnabled", java.lang.Boolean.TRUE)));
   }

   public override fun getGoogleAdvertisingId(promise: Promise) {
      q.h(var1, "promise");
      this.cleanupCurrentOperation();
      val var2: ListenableFuture = this.getAdvertisingIdInfoAsync();
      this.currentOperation.set(var2);
      d.a(var2, new c(this, var1) {
         final Promise $promise;
         final AdsModule this$0;

         {
            this.this$0 = var1;
            this.$promise = var2;
         }

         public void onFailure(java.lang.Throwable var1) {
            q.h(var1, "t");
            AdsModule.access$getCurrentOperation$p(this.this$0).set(null);
            if (var1 is CancellationException) {
               Log.i$default(Log.INSTANCE, "AdsModule", "Google advertising ID operation was cancelled", null, 4, null);
               AdsModule.access$resolveWithNullId(this.this$0, this.$promise);
            } else {
               val var3: Log = Log.INSTANCE;
               val var2: java.lang.String = var1.getMessage();
               val var4: StringBuilder = new StringBuilder();
               var4.append("Error getting google advertising ID: ");
               var4.append(var2);
               var3.e("AdsModule", var4.toString(), var1);
               this.$promise.reject("err", "Failed to get google advertising ID", var1);
            }
         }

         public void onSuccess(Info var1) {
            q.h(var1, "adInfo");
            AdsModule.access$getCurrentOperation$p(this.this$0).set(null);
            val var7: java.lang.String = var1.a();
            val var2: Boolean = var1.b();
            val var5: java.lang.String;
            if (var2) {
               var5 = null;
            } else {
               var5 = var7;
            }

            val var6: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(s.a("googleAdvertisingId", var5), s.a("isLimitAdTrackingEnabled", var2));
            if (var2) {
               Log.i$default(Log.INSTANCE, "AdsModule", "User has limited ad tracking, returning null ID", null, 4, null);
            } else {
               Log.i$default(Log.INSTANCE, "AdsModule", "Successfully retrieved google advertising ID", null, 4, null);
            }

            this.$promise.resolve(var6);
         }
      }, this.adExecutor);
   }

   public open fun invalidate() {
      this.cleanupCurrentOperation();
      this.adExecutor.shutdown();
      super.invalidate();
   }

   public companion object {
      private const val TAG: String
   }
}
