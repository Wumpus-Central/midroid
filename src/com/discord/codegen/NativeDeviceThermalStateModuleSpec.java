package com.discord.codegen;

import Q2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDeviceThermalStateModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDeviceThermalStateModule";

   public NativeDeviceThermalStateModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void addListener(String var1);

   public String getName() {
      return "NativeDeviceThermalStateModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract Double getThermalState();

   @ReactMethod
   @a
   public abstract void removeListeners(double var1);
}
