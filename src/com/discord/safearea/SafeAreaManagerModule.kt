package com.discord.safearea

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import g9.s
import kotlin.jvm.internal.q

public class SafeAreaManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, Any> {
      val var1: SafeAreaEdgeInsets = SafeAreaEdgeInsets.Companion.fromRootView(this.getCurrentActivity());
      return h9.q.m(new Pair[]{s.a("top", var1.getTopDp()), s.a("bottom", var1.getBottomDp()), s.a("left", var1.getLeftDp()), s.a("right", var1.getRightDp())});
   }

   public open fun getName(): String {
      return "DCDSafeAreaManager";
   }
}
