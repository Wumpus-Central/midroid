package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import u3.a;

public abstract class NativeThemeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeThemeModule";

   public NativeThemeModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeThemeModule";
   }

   @ReactMethod
   @a
   public abstract void updateSaturation(double var1);

   @ReactMethod
   @a
   public abstract void updateTheme(String var1);
}
