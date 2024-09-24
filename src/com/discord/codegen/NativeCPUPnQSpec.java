package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import w6.a;

public abstract class NativeCPUPnQSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "CPUPnQModule";

   public NativeCPUPnQSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void enable(double var1);

   public String getName() {
      return "CPUPnQModule";
   }

   @ReactMethod
   @a
   public abstract void hangNativeThread(double var1);
}
