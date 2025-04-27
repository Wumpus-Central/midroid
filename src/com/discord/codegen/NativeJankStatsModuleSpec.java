package com.discord.codegen;

import U2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeJankStatsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeJankStatsModule";

   public NativeJankStatsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeJankStatsModule";
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
