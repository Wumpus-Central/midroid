package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import v7.a;

public abstract class NativeArchitectureProviderSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNArchitectureProvider";

   public NativeArchitectureProviderSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "RTNArchitectureProvider";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean isFabric();
}
