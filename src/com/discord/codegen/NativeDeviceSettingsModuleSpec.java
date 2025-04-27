package com.discord.codegen;

import U2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDeviceSettingsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDeviceSettingsModule";

   public NativeDeviceSettingsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

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
