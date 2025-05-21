package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import u3.a;

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
