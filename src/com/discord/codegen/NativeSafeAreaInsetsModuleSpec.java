package com.discord.codegen;

import S2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSafeAreaInsetsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeSafeAreaInsetsModule";

   public NativeSafeAreaInsetsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract double getImeInsets(boolean var1);

   public String getName() {
      return "NativeSafeAreaInsetsModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract WritableMap getStableSafeAreaInsets();

   @ReactMethod
   @a
   public abstract void setNavigationBarVisible(boolean var1);

   @ReactMethod
   @a
   public abstract void setStatusBarVisible(boolean var1);
}
