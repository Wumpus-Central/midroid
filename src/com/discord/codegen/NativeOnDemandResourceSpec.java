package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import w6.a;

public abstract class NativeOnDemandResourceSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNOnDemandResource";

   public NativeOnDemandResourceSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void fetchOnDemandResource(String var1, Promise var2);

   public String getName() {
      return "RTNOnDemandResource";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean hasOnDemandResource(String var1);

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean isOnDemandResourcingAvailable();
}
