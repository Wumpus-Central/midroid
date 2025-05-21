package com.discord.codegen;

import K3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeCPUPnQModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeCPUPnQModule";

   public NativeCPUPnQModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void enable(double var1);

   public String getName() {
      return "NativeCPUPnQModule";
   }

   @ReactMethod
   @a
   public abstract void hangNativeThread(double var1);
}
