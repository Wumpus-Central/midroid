package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import d6.a;

public abstract class NativeThemeManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
   public static final String NAME = "RTNThemeManager";

   public NativeThemeManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "RTNThemeManager";
   }

   @ReactMethod
   @a
   public abstract void updateSaturation(double var1);

   @ReactMethod
   @a
   public abstract void updateTheme(String var1);
}
