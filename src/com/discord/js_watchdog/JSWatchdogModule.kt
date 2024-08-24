package com.discord.js_watchdog

import com.discord.codegen.NativeJSWatchdogSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r

public class JSWatchdogModule(reactContext: ReactApplicationContext) : NativeJSWatchdogSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun checkForStallReport(): WritableMap? {
      val var1: StallReport = JSWatchdogManager.INSTANCE.checkForExistingReport();
      val var2: WritableMap;
      if (var1 != null) {
         var2 = var1.serialize();
      } else {
         var2 = null;
      }

      return var2;
   }

   public open fun disable() {
      JSWatchdogManager.INSTANCE.disable();
   }

   public open fun ping(sentTimestamp: Double, sessionId: String?, resetTimestamps: Boolean?, promise: Promise) {
      r.h(var5, "promise");
      val var6: Boolean;
      if (var4 != null) {
         var6 = var4;
      } else {
         var6 = false;
      }

      val var7: Long = (long)var1;
      var var10: java.lang.String = var3;
      if (var3 == null) {
         var10 = "";
      }

      JSWatchdogManager.INSTANCE.ping(var6, var7, var10, var5);
   }

   public companion object {
      public const val NAME: String
   }
}
