package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import d6.a;
import java.util.Map;

public abstract class NativeDeviceLocaleManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
   public static final String NAME = "RTNDeviceLocaleManager";

   public NativeDeviceLocaleManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      return this.getTypedExportedConstants();
   }

   public String getName() {
      return "RTNDeviceLocaleManager";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}
