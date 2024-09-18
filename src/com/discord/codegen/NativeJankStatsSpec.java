package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import k6.a;

public abstract class NativeJankStatsSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "JankStatsModule";

   public NativeJankStatsSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "JankStatsModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract WritableMap requestReport();

   @ReactMethod
   @a
   public abstract void setJankHeuristicMultiplier(double var1);

   @ReactMethod
   @a
   public abstract void startTracking();

   @ReactMethod
   @a
   public abstract void stopTracking();
}
