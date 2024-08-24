package com.discord.appreview

import android.app.Activity
import com.discord.codegen.NativeAppRatingRequestManagerSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

@ReactModule(name = "AppRatingRequestModule")
public class AppRatingRequestModule(reactContext: ReactApplicationContext) : NativeAppRatingRequestManagerSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "RTNAppRatingRequestManager";
   }

   public open fun requestRating(promise: Promise) {
      r.h(var1, "promise");
      val var2: Activity = this.getCurrentActivity();
      if (var2 == null) {
         var1.reject(new IllegalStateException("current activity is null"));
      } else {
         new AppRatingRequester(var2, false, new Function0<Unit>(var1) {
            final Promise $promise;

            {
               super(0);
               this.$promise = var1;
            }

            public final void invoke() {
               this.$promise.resolve(0);
            }
         }, new Function1<Exception, Unit>(var1) {
            final Promise $promise;

            {
               super(1);
               this.$promise = var1;
            }

            public final void invoke(Exception var1) {
               r.h(var1, "exception");
               this.$promise.reject(var1);
            }
         }).executeRequest();
      }
   }

   public companion object {
      public const val NAME: String
      private const val SUCCESS: Int
   }
}
