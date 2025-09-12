package com.discord.shortcuts

import androidx.core.content.pm.b
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = "DCDShortcutManager")
public class ShortcutManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public override fun getName(): String {
      return "DCDShortcutManager";
   }

   @ReactMethod
   public fun handleLogout() {
      b.h(this.reactContext);
   }

   public companion object {
      public const val NAME: String
   }
}
