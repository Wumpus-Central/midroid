package com.discord.codegen;

import U2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeKeyboardModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeKeyboardModule";

   public NativeKeyboardModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void clearCurrentFocusAndDismissKeyboard();

   @ReactMethod
   @a
   public abstract void dismissGlobalKeyboard();

   public String getName() {
      return "NativeKeyboardModule";
   }

   @ReactMethod
   @a
   public abstract void onKeyboardChanged(boolean var1);
}
