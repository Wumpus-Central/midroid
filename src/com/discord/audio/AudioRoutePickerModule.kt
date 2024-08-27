package com.discord.audio

import com.discord.logging.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class AudioRoutePickerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "AudioRoutePicker";
   }

   @ReactMethod
   public fun handleAudioRoute(isSpeaker: Boolean) {
      val var2: Log = Log.INSTANCE;
      val var3: StringBuilder = new StringBuilder();
      var3.append("handleAudioRoute ");
      var3.append(var1);
      Log.i$default(var2, "AudioRoutePickerModule", var3.toString(), null, 4, null);
   }

   @ReactMethod
   public fun resetPortOverride() {
      Log.i$default(Log.INSTANCE, "AudioRoutePickerModule", "resetPortOverride", null, 4, null);
   }

   @ReactMethod
   public fun showAudioPicker() {
      Log.i$default(Log.INSTANCE, "AudioRoutePickerModule", "resetPortOverride", null, 4, null);
   }

   @ReactMethod
   public fun toggleSpeaker(isSpeaker: Boolean) {
      val var3: Log = Log.INSTANCE;
      val var2: StringBuilder = new StringBuilder();
      var2.append("toggleSpeaker ");
      var2.append(var1);
      Log.i$default(var3, "AudioRoutePickerModule", var2.toString(), null, 4, null);
   }

   public companion object {
      private const val LOG_TAG: String
   }
}
