package com.discord.codegen;

import R2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAudioPlayerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAudioPlayerModule";

   public NativeAudioPlayerModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeAudioPlayerModule";
   }

   @ReactMethod
   @a
   public abstract void handleVoiceMessageDeleted(String var1);

   @ReactMethod
   @a
   public abstract void maybePlayCurrentPlayer();

   @ReactMethod
   @a
   public abstract void pauseCurrentPlayer(boolean var1);
}
