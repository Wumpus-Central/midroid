package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import d6.a;

public abstract class NativeStartupFlagsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
   public static final String NAME = "RTNStartupFlags";

   public NativeStartupFlagsSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "RTNStartupFlags";
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
