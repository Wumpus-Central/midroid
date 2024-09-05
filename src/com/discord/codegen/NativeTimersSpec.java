package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import f8.a;

public abstract class NativeTimersSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "TimersModule";

   public NativeTimersSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void addListener(String var1);

   @ReactMethod
   @a
   public abstract void clearInterval(double var1);

   @ReactMethod
   @a
   public abstract void clearTimeout(double var1);

   public String getName() {
      return "TimersModule";
   }

   @ReactMethod
   @a
   public abstract void removeListeners(double var1);

   @ReactMethod
   @a
   public abstract void setInterval(double var1, double var3);

   @ReactMethod
   @a
   public abstract void setTimeout(double var1, double var3);
}
