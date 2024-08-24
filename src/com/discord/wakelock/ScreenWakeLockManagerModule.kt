package com.discord.wakelock

import android.app.Activity
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class ScreenWakeLockManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "ScreenWakeLockManager";
   }

   @ReactMethod
   public fun releaseLock(key: String) {
      r.h(var1, "key");
      val var2: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.releaseLock(var2, var1);
      }
   }

   @ReactMethod
   public fun requestLock(key: String) {
      r.h(var1, "key");
      val var2: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.requestLock(var2, var1);
      }
   }
}
