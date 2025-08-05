package com.discord.codegen;

import J3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeCommandClipboardModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeCommandClipboardModule";

   public NativeCommandClipboardModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeCommandClipboardModule";
   }

   @ReactMethod
   @a
   public abstract void setItem(String var1, String var2, String var3);
}
