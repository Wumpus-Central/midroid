package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeClientInfoManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
   public static final String NAME = "RTNClientInfoManager";

   public NativeClientInfoManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "RTNClientInfoManager";
   }
}
