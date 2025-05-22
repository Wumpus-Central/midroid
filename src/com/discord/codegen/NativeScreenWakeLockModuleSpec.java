package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import v3.a;

public abstract class NativeScreenWakeLockModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeScreenWakeLockModule";

   public NativeScreenWakeLockModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeScreenWakeLockModule";
   }

   @ReactMethod
   @a
   public abstract void releaseLock(String var1);

   @ReactMethod
   @a
   public abstract void requestLock(String var1);
}
