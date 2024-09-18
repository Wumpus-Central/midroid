package com.discord.wakelock

import android.app.Activity
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class ScreenWakeLockManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "ScreenWakeLockManager";
   }

   @ReactMethod
   public fun releaseLock(key: String) {
      q.h(var1, "key");
      val var2: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.releaseLock(var2, var1);
      }
   }

   @ReactMethod
   public fun requestLock(key: String) {
      q.h(var1, "key");
      val var2: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         ScreenWakeLock.INSTANCE.requestLock(var2, var1);
      }
   }
}
