package com.discord.chat.presentation.message.view.voicemessages

import android.app.Activity
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = "DCDAudioPlayerManager")
public class AudioPlayerManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      kotlin.jvm.internal.r.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `maybePlayCurrentPlayer$lambda$1`() {
      AudioPlayerManager.INSTANCE.maybePlayCurrentPlayer();
   }

   @JvmStatic
   fun `pauseCurrentPlayer$lambda$0`(var0: Boolean) {
      AudioPlayerManager.INSTANCE.pauseCurrentPlayer(var0);
   }

   public open fun getName(): String {
      return "DCDAudioPlayerManager";
   }

   @ReactMethod
   public fun maybePlayCurrentPlayer() {
      val var1: Activity = this.getCurrentActivity();
      if (var1 != null) {
         var1.runOnUiThread(new h());
      }
   }

   @ReactMethod
   public fun pauseCurrentPlayer(storePauseState: Boolean) {
      val var2: Activity = this.getCurrentActivity();
      if (var2 != null) {
         var2.runOnUiThread(new g(var1));
      }
   }

   public companion object {
      public const val NAME: String
   }
}
