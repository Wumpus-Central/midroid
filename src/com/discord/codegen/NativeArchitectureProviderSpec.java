package com.discord.codegen;

import U2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeArchitectureProviderSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeArchitectureProvider";

   public NativeArchitectureProviderSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeArchitectureProvider";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean isFabric();
}
