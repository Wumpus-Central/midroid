package com.discord.wakelock

import android.app.Activity
import com.discord.codegen.NativeScreenWakeLockModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

internal class ScreenWakeLockModule(reactContext: ReactApplicationContext) : NativeScreenWakeLockModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun releaseLock(key: String) {
      r.h(var1, "key");
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.releaseLock(var2, var1);
      }
   }

   public override fun requestLock(key: String) {
      r.h(var1, "key");
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.requestLock(var2, var1);
      }
   }
}
