package com.discord.safearea

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import f8.w
import kotlin.jvm.internal.q

public class SafeAreaManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, Any> {
      val var1: SafeAreaEdgeInsets = SafeAreaEdgeInsets.Companion.fromRootView(this.getCurrentActivity());
      return g8.q.m(new Pair[]{w.a("top", var1.getTopDp()), w.a("bottom", var1.getBottomDp()), w.a("left", var1.getLeftDp()), w.a("right", var1.getRightDp())});
   }

   public open fun getName(): String {
      return "DCDSafeAreaManager";
   }
}
