package com.discord.codegen;

import S2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeLinkingModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeLinkingModule";

   public NativeLinkingModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeLinkingModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean tryOpenScheme(String var1);

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean tryOpenUrlAsUniversalLink(String var1);
}
