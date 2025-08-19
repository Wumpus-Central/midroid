package com.discord.js_watchdog

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nJSWatchdogStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSWatchdogStorage.kt\ncom/discord/js_watchdog/JSWatchdogStorage\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,65:1\n41#2,12:66\n41#2,12:78\n*S KotlinDebug\n*F\n+ 1 JSWatchdogStorage.kt\ncom/discord/js_watchdog/JSWatchdogStorage\n*L\n28#1:66,12\n49#1:78,12\n*E\n"])
public class JSWatchdogStorage(context: Context) {
   public final val storage: SharedPreferences

   private final val stallTime: Int
      private final get() {
         return this.storage.getInt("stall_time", 0);
      }


   private final val sessionId: String
      private final get() {
         val var2: java.lang.String = this.storage.getString("session_id", null);
         var var1: java.lang.String = var2;
         if (var2 == null) {
            var1 = "";
         }

         return var1;
      }


   public final val trace: String?
      public final get() {
         return this.storage.getString("trace", null);
      }


   init {
      val var2: SharedPreferences = var1.getSharedPreferences("js_watchdog", 0);
      this.storage = var2;
   }

   public fun clear() {
      val var1: Editor = this.storage.edit();
      var1.clear();
      var1.apply();
   }

   public fun getStallReportAndClear(): StallReport? {
      val var1: Int = this.getStallTime();
      if (var1 > 0) {
         val var2: StallReport = new StallReport(var1, this.getSessionId(), this.getTrace());
         this.clear();
         return var2;
      } else {
         return null;
      }
   }

   public fun update(stallTime: Int, sessionId: String, trace: String?) {
      val var4: Editor = this.storage.edit();
      var4.putInt("stall_time", var1);
      var4.putString("session_id", var2);
      if (var3 != null) {
         var4.putString("trace", var3);
      }

      var4.apply();
   }

   public companion object {
      private final var instance: JSWatchdogStorage?

      public fun getInstance(context: Context): JSWatchdogStorage {
         if (JSWatchdogStorage.access$getInstance$cp() == null) {
            JSWatchdogStorage.access$setInstance$cp(new JSWatchdogStorage(var1));
         }

         val var2: JSWatchdogStorage = JSWatchdogStorage.access$getInstance$cp();
         return var2;
      }
   }
}
