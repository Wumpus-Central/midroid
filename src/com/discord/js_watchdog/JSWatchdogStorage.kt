package com.discord.js_watchdog

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.q

public class JSWatchdogStorage(context: Context) {
   private final val sessionId: String
      private final get() {
         val var2: java.lang.String = this.storage.getString("session_id", null);
         var var1: java.lang.String = var2;
         if (var2 == null) {
            var1 = "";
         }

         return var1;
      }


   private final val stallTime: Int
      private final get() {
         return this.storage.getInt("stall_time", 0);
      }


   public final val storage: SharedPreferences

   public final val trace: String?
      public final get() {
         return this.storage.getString("trace", null);
      }


   init {
      q.h(var1, "context");
      super();
      val var2: SharedPreferences = var1.getSharedPreferences("js_watchdog", 0);
      q.g(var2, "getSharedPreferences(...)");
      this.storage = var2;
   }

   public fun clear() {
      val var1: Editor = this.storage.edit();
      q.g(var1, "editor");
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
      q.h(var2, "sessionId");
      val var4: Editor = this.storage.edit();
      q.g(var4, "editor");
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
         q.h(var1, "context");
         if (JSWatchdogStorage.access$getInstance$cp() == null) {
            JSWatchdogStorage.access$setInstance$cp(new JSWatchdogStorage(var1));
         }

         val var2: JSWatchdogStorage = JSWatchdogStorage.access$getInstance$cp();
         q.e(var2);
         return var2;
      }
   }
}
