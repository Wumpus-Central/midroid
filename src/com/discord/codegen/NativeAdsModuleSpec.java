package com.discord.codegen;

import K3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAdsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAdsModule";

   public NativeAdsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void getGoogleAdvertisingId(Promise var1);

   public String getName() {
      return "NativeAdsModule";
   }
}
