package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeAdsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAdsModule";

   public NativeAdsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void getGoogleAdvertisingId(Promise var1);

   @Override
   public String getName() {
      return "NativeAdsModule";
   }
}
