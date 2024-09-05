package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import f8.a;
import java.util.Map;

public abstract class NativeClientInfoManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNClientInfoManager";

   public NativeClientInfoManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      return this.getTypedExportedConstants();
   }

   public String getName() {
      return "RTNClientInfoManager";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}
