package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import u3.a;

public abstract class NativeMetricMonitorModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeMetricMonitorModule";

   public NativeMetricMonitorModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void addListener(String var1);

   public String getName() {
      return "NativeMetricMonitorModule";
   }

   @ReactMethod
   @a
   public abstract void removeListeners(double var1);
}
