package com.discord.appreview

import android.app.Activity
import com.discord.codegen.NativeAppRatingRequestModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r
import m1.a
import m1.b

public class AppRatingRequestModule(reactContext: ReactApplicationContext) : NativeAppRatingRequestModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `requestRating$lambda$0`(var0: Promise): Unit {
      var0.resolve(0);
      return Unit.a;
   }

   @JvmStatic
   fun `requestRating$lambda$1`(var0: Promise, var1: Exception): Unit {
      r.h(var1, "exception");
      var0.reject(var1);
      return Unit.a;
   }

   public override fun requestRating(promise: Promise) {
      r.h(var1, "promise");
      val var2: Activity = this.getCurrentActivity();
      if (var2 == null) {
         var1.reject(new IllegalStateException("current activity is null"));
      } else {
         new AppRatingRequester(var2, false, new a(var1), new b(var1)).executeRequest();
      }
   }

   public companion object {
      private const val SUCCESS: Int
   }
}
