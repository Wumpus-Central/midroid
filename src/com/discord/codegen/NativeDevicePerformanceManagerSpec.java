package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import s6.a;

public abstract class NativeDevicePerformanceManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNDevicePerformanceManager";

   public NativeDevicePerformanceManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract double getMediaPerformanceClass();

   public String getName() {
      return "RTNDevicePerformanceManager";
   }
}
