package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import v6.a;

public abstract class NativeMobileVoiceOverlaySpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNMobileVoiceOverlay";

   public NativeMobileVoiceOverlaySpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void enableOverlay(Promise var1);

   public String getName() {
      return "RTNMobileVoiceOverlay";
   }

   @ReactMethod
   @a
   public abstract void hideOverlay();

   @ReactMethod
   @a
   public abstract void setData(ReadableMap var1);

   @ReactMethod
   @a
   public abstract void showOverlay(ReadableMap var1);
}
