package com.discord.js_watchdog

import com.discord.codegen.NativeJSWatchdogModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap

public class JSWatchdogModule(reactContext: ReactApplicationContext) : NativeJSWatchdogModuleSpec(var1) {
   public override fun checkForStallReport(): WritableMap? {
      val var1: StallReport = JSWatchdogManager.INSTANCE.checkForExistingReport();
      return if (var1 != null) var1.serialize() else null;
   }

   public override fun disable() {
      JSWatchdogManager.INSTANCE.disable();
   }

   public override fun ping(sentTimestamp: Double, sessionId: String?, resetTimestamps: Boolean?, enableTrace: Boolean?, promise: Promise) {
      var var8: Boolean = false;
      val var7: Boolean;
      if (var4 != null) {
         var7 = var4;
      } else {
         var7 = false;
      }

      val var9: Long = (long)var1;
      var var12: java.lang.String = var3;
      if (var3 == null) {
         var12 = "";
      }

      if (var5 != null) {
         var8 = var5;
      }

      JSWatchdogManager.INSTANCE.ping(var7, var9, var12, var8, var6);
   }
}
