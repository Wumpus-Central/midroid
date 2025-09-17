package com.discord.codegen;

import H3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAudioManagerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAudioManagerModule";

   public NativeAudioManagerModuleSpec(ReactApplicationContext var1) {
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
      return "NativeAudioManagerModule";
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
