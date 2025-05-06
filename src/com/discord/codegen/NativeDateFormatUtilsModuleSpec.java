package com.discord.codegen;

import R2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDateFormatUtilsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDateFormatUtilsModule";

   public NativeDateFormatUtilsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean activate();

   public String getName() {
      return "NativeDateFormatUtilsModule";
   }
}
