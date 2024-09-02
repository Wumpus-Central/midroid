package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import v7.a;

public abstract class NativeAppRatingRequestManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNAppRatingRequestManager";

   public NativeAppRatingRequestManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "RTNAppRatingRequestManager";
   }

   @ReactMethod
   @a
   public abstract void requestRating(Promise var1);
}
