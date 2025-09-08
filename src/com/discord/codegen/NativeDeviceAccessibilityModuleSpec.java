package com.discord.codegen;

import H3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDeviceAccessibilityModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDeviceAccessibilityModule";

   public NativeDeviceAccessibilityModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void disableFocusLock();

   @ReactMethod
   @a
   public abstract void enableFocusLock(ReadableArray var1, boolean var2);

   public String getName() {
      return "NativeDeviceAccessibilityModule";
   }

   @ReactMethod
   @a
   public abstract void handleSetPrefersReducedMotion(String var1);

   @ReactMethod
   @a
   public abstract void setAccessibilityFocus(double var1, Promise var3);
}
