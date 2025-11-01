package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeFontModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeFontModule";

   public NativeFontModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract WritableMap getCustomFontScale();

   @Override
   public String getName() {
      return "NativeFontModule";
   }

   @ReactMethod
   @a
   public abstract void setCustomFontScale(double var1, boolean var3);
}
