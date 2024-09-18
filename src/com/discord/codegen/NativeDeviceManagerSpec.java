package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import k6.a;

public abstract class NativeDeviceManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNDeviceManager";

   public NativeDeviceManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      return this.getTypedExportedConstants();
   }

   public String getName() {
      return "RTNDeviceManager";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}
