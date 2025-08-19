package com.discord.wakelock

import android.app.Activity
import com.discord.codegen.NativeScreenWakeLockModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

internal class ScreenWakeLockModule(reactContext: ReactApplicationContext) : NativeScreenWakeLockModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public override fun releaseLock(key: String) {
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.releaseLock(var2, var1);
      }
   }

   public override fun requestLock(key: String) {
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.requestLock(var2, var1);
      }
   }
}
