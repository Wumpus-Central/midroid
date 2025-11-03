package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeAppLifecycleModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAppLifecycleModule";

   public NativeAppLifecycleModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void addListener(String var1);

   @Override
   public String getName() {
      return "NativeAppLifecycleModule";
   }

   @ReactMethod
   @a
   public abstract void removeListeners(double var1);
}
