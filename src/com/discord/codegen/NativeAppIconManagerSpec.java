package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import w6.a;

public abstract class NativeAppIconManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNAppIconManager";

   public NativeAppIconManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void getAvailableIcons(Promise var1);

   @ReactMethod
   @a
   public abstract void getCurrentIcon(Promise var1);

   public String getName() {
      return "RTNAppIconManager";
   }

   @ReactMethod
   @a
   public abstract void setIcon(String var1, Promise var2);
}
