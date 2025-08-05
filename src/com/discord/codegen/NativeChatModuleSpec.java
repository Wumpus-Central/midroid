package com.discord.codegen;

import J3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeChatModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeChatModule";

   public NativeChatModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void clearRows(double var1, double var3);

   public String getName() {
      return "NativeChatModule";
   }

   @ReactMethod
   @a
   public abstract void updateRows(double var1, String var3, boolean var4, String var5, double var6, boolean var8);
}
