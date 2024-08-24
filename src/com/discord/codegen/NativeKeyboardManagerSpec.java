package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import d6.a;

public abstract class NativeKeyboardManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
   public static final String NAME = "RTNKeyboardManager";

   public NativeKeyboardManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void clearCurrentFocusAndDismissKeyboard();

   @ReactMethod
   @a
   public abstract void dismissGlobalKeyboard();

   public String getName() {
      return "RTNKeyboardManager";
   }

   @ReactMethod
   @a
   public abstract void onKeyboardChanged(boolean var1);
}
