package com.discord.codegen;

import R2.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAppRatingRequestModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAppRatingRequestModule";

   public NativeAppRatingRequestModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeAppRatingRequestModule";
   }

   @ReactMethod
   @a
   public abstract void requestRating(Promise var1);
}
