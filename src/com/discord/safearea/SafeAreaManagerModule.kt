package com.discord.safearea

import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import gh.w
import hh.r
import kotlin.jvm.internal.q

public class SafeAreaManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, Any> {
      val var1: SafeAreaEdgeInsets = SafeAreaEdgeInsets.Companion.fromRootView(this.getCurrentActivity());
      return r.m(new Pair[]{w.a("top", var1.getTopDp()), w.a("bottom", var1.getBottomDp()), w.a("left", var1.getLeftDp()), w.a("right", var1.getRightDp())});
   }

   public open fun getName(): String {
      return "DCDSafeAreaManager";
   }

   @ReactMethod
   public fun getStableSafeAreaInsets(promise: Promise) {
      q.h(var1, "promise");
      val var2: SafeAreaEdgeInsets = SafeAreaEdgeInsets.Companion.fromRootViewAsStableInsets(this.getCurrentActivity());
      var1.resolve(
         NativeMapExtensionsKt.nativeMapOf(
            w.a("top", var2.getTopDp()), w.a("bottom", var2.getBottomDp()), w.a("left", var2.getLeftDp()), w.a("right", var2.getRightDp())
         )
      );
   }
}
