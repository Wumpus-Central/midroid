package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeProximitySensorManagerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeProximitySensorManagerModule";

   public NativeProximitySensorManagerModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @Override
   public String getName() {
      return "NativeProximitySensorManagerModule";
   }

   @ReactMethod
   @a
   public abstract void setProximityMonitoringEnabled(boolean var1);
}
