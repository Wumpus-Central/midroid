package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import d6.a;

public abstract class NativeClipboardManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
   public static final String NAME = "RTNClipboardManager";

   public NativeClipboardManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "RTNClipboardManager";
   }

   @ReactMethod
   @a
   public abstract void setItem(String var1, String var2, String var3);
}
