package com.discord.core

import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "ThumbnailLoaderSettings")
@SourceDebugExtension(["SMAP\nThumbnailLoaderSettingsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailLoaderSettingsModule.kt\ncom/discord/core/ThumbnailLoaderSettingsModule\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,36:1\n41#2,12:37\n*S KotlinDebug\n*F\n+ 1 ThumbnailLoaderSettingsModule.kt\ncom/discord/core/ThumbnailLoaderSettingsModule\n*L\n31#1:37,12\n*E\n"])
public class ThumbnailLoaderSettingsModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   public open fun getName(): String {
      return "ThumbnailLoaderSettings";
   }

   @ReactMethod
   public fun setThumbnailLoaderSerialized(serialized: Boolean) {
      val var2: SharedPreferences = this.getReactApplicationContext().getApplicationContext().getSharedPreferences("ThumbnailLoaderSettings", 0);
      val var3: Editor = var2.edit();
      var3.putBoolean("serialized", var1);
      var3.apply();
   }
}
