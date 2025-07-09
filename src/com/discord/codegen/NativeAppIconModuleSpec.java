package com.discord.codegen;

import J3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAppIconModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAppIconModule";

   public NativeAppIconModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void getAvailableIcons(Promise var1);

   @ReactMethod
   @a
   public abstract void getCurrentIcon(Promise var1);

   public String getName() {
      return "NativeAppIconModule";
   }

   @ReactMethod
   @a
   public abstract void setIcon(String var1, Promise var2);
}
