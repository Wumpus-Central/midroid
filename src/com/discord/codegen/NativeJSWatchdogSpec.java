package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import n6.a;

public abstract class NativeJSWatchdogSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "JSWatchdogModule";

   public NativeJSWatchdogSpec(ReactApplicationContext var1) {
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
      return "JSWatchdogModule";
   }

   @ReactMethod
   @a
   public abstract void ping(double var1, String var3, Boolean var4, Boolean var5, Promise var6);
}
