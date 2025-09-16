package com.discord.codegen;

import H3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeStartupFlagsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeStartupFlagsModule";

   public NativeStartupFlagsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeStartupFlagsModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean reactProfilingEnabled();

   @ReactMethod
   @a
   public abstract void setReactProfilingEnabled(boolean var1);
}
