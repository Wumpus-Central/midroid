package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import v7.a;

public abstract class NativeAudioRouteEmitterSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNAudioRouteEmitter";

   public NativeAudioRouteEmitterSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void getCurrentRoute(Promise var1);

   public String getName() {
      return "RTNAudioRouteEmitter";
   }
}
