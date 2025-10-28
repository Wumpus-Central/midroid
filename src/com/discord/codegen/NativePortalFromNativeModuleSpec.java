package com.discord.codegen;

import O4.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativePortalFromNativeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativePortalFromNativeModule";

   public NativePortalFromNativeModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativePortalFromNativeModule";
   }

   @ReactMethod
   @a
   public abstract void unregisterView(double var1);
}
