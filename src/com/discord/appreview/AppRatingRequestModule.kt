package com.discord.appreview

import android.app.Activity
import com.discord.codegen.NativeAppRatingRequestModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class AppRatingRequestModule(reactContext: ReactApplicationContext) : NativeAppRatingRequestModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun requestRating(promise: Promise) {
      q.h(var1, "promise");
      val var2: Activity = this.getCurrentActivity();
      if (var2 == null) {
         var1.reject(new IllegalStateException("current activity is null"));
      } else {
         new AppRatingRequester(var2, false, new Function0(var1) {
            final Promise $promise;

            {
               super(0);
               this.$promise = var1;
            }

            public final void invoke() {
               this.$promise.resolve(0);
            }
         }, new Function1(var1) {
            final Promise $promise;

            {
               super(1);
               this.$promise = var1;
            }

            public final void invoke(Exception var1) {
               q.h(var1, "exception");
               this.$promise.reject(var1);
            }
         }).executeRequest();
      }
   }

   public companion object {
      private const val SUCCESS: Int
   }
}
