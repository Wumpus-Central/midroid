package com.discord.shortcuts

import androidx.core.content.pm.b
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import kotlin.jvm.internal.q

@ReactModule(name = "DCDShortcutManager")
public class ShortcutManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public open fun getName(): String {
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
