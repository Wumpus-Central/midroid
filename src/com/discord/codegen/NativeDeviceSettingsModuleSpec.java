package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeDeviceSettingsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDeviceSettingsModule";

   public NativeDeviceSettingsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @Override
   public String getName() {
      return "NativeDeviceSettingsModule";
   }

   @ReactMethod
   @a
   public abstract void openAccessibilitySettings();

   @ReactMethod
   @a
   public abstract void openNotificationSettings();

   @ReactMethod
   @a
   public abstract void openPrivacySettings();

   @ReactMethod
   @a
   public abstract void setSystemGestureExclusionRects(ReadableArray var1);
}
