package com.discord.js_watchdog

import com.discord.codegen.NativeJSWatchdogSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q

public class JSWatchdogModule(reactContext: ReactApplicationContext) : NativeJSWatchdogSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun checkForStallReport(): WritableMap? {
      val var1: StallReport = JSWatchdogManager.INSTANCE.checkForExistingReport();
      val var2: WritableMap;
      if (var1 != null) {
         var2 = var1.serialize();
      } else {
         var2 = null;
      }

      return var2;
   }

   public override fun disable() {
      JSWatchdogManager.INSTANCE.disable();
   }

   public override fun ping(sentTimestamp: Double, sessionId: String?, resetTimestamps: Boolean?, enableTrace: Boolean?, promise: Promise) {
      q.h(var6, "promise");
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

      val var8: Boolean;
      if (var5 != null) {
         var8 = var5;
      } else {
         var8 = false;
      }

      JSWatchdogManager.INSTANCE.ping(var7, var9, var12, var8, var6);
   }

   public companion object {
      public const val NAME: String
   }
}
