package com.discord.codegen;

import K3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeJSWatchdogModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeJSWatchdogModule";

   public NativeJSWatchdogModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract WritableMap checkForStallReport();

   @ReactMethod
   @a
   public abstract void disable();

   public String getName() {
      return "NativeJSWatchdogModule";
   }

   @ReactMethod
   @a
   public abstract void ping(double var1, String var3, Boolean var4, Boolean var5, Promise var6);
}
