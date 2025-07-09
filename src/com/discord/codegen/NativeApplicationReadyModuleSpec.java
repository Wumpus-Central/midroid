package com.discord.codegen;

import J3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeApplicationReadyModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeApplicationReadyModule";

   public NativeApplicationReadyModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void applicationReady(Promise var1);

   public String getName() {
      return "NativeApplicationReadyModule";
   }
}
