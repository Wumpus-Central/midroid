package com.discord.core

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = "ThumbnailLoaderSettings")
public class ThumbnailLoaderSettingsModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   public open fun getName(): String {
      return "ThumbnailLoaderSettings";
   }

   @ReactMethod
   public fun setThumbnailLoaderSerialized(serialized: Boolean) {
      this.getReactApplicationContext()
         .getApplicationContext()
         .getSharedPreferences("ThumbnailLoaderSettings", 0)
         .edit()
         .putBoolean("serialized", var1)
         .apply();
   }
}
