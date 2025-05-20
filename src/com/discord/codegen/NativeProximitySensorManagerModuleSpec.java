package com.discord.codegen;

import S2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeProximitySensorManagerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeProximitySensorManagerModule";

   public NativeProximitySensorManagerModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeProximitySensorManagerModule";
   }

   @ReactMethod
   @a
   public abstract void setProximityMonitoringEnabled(boolean var1);
}
