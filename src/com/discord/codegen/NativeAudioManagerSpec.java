package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import d6.a;

public abstract class NativeAudioManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
   public static final String NAME = "RTNAudioManager";

   public NativeAudioManagerSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void addListener(String var1);

   @ReactMethod
   @a
   public abstract void getActiveAudioDevice(Promise var1);

   @ReactMethod
   @a
   public abstract void getAudioDevices(Promise var1);

   public String getName() {
      return "RTNAudioManager";
   }

   @ReactMethod
   @a
   public abstract void removeListeners(double var1);

   @ReactMethod
   @a
   public abstract void setActiveAudioDevice(ReadableMap var1);

   @ReactMethod
   @a
   public abstract void setCommunicationModeOn(boolean var1);

   @ReactMethod
   @a
   public abstract void setSCORetryCount(double var1);
}
