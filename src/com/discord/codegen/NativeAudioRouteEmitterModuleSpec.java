package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeAudioRouteEmitterModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAudioRouteEmitterModule";

   public NativeAudioRouteEmitterModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void getCurrentRoute(Promise var1);

   @Override
   public String getName() {
      return "NativeAudioRouteEmitterModule";
   }
}
