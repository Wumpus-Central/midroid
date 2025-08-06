package com.discord.crash_reporting.system_logs

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason
import com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone
import com.discord.logging.Log
import io.sentry.SentryEvent
import io.sentry.protocol.SentryStackFrame
import io.sentry.protocol.q
import io.sentry.protocol.v
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.r

internal object SystemLogReport {
   private final val TAG: String = SystemLogReport.class.getSimpleName()

   private fun checkHashChanged(context: Context, hash: String): Boolean {
      val var3: SystemLogReport.LastStoredTombstoneCache = SystemLogReport.LastStoredTombstoneCache.INSTANCE;
      if (r.c(SystemLogReport.LastStoredTombstoneCache.INSTANCE.get(var1), var2)) {
         return false;
      } else {
         var3.set(var1, var2);
         return true;
      }
   }

   private fun recordBreadcrumb(msg: String, category: String) {
      val var3: Log = Log.INSTANCE;
      val var5: java.lang.String = TAG;
      r.g(TAG, "TAG");
      val var4: StringBuilder = new StringBuilder();
      var4.append("Breadcrumb, [");
      var4.append(var2);
      var4.append("]: ");
      var4.append(var1);
      Log.i$default(var3, var5, var4.toString(), null, 4, null);
   }

   @JvmStatic
   fun `recordSentryCrash$lambda$3`(var0: SentryStackFrame): java.lang.CharSequence {
      val var3: java.lang.String = var0.u();
      val var1: java.lang.String = var0.s();
      val var2: java.lang.String = var0.r();
      val var5: Int = var0.t();
      val var4: StringBuilder = new StringBuilder();
      var4.append(var3);
      var4.append(".");
      var4.append(var1);
      var4.append("(");
      var4.append(var2);
      var4.append(":");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   @JvmStatic
   fun `reportLastCrash$lambda$2`(var0: Context, var1: Function3, var2: SystemLogUtils.Tombstone): Unit {
      val var3: Boolean;
      if (var2 != null) {
         for (java.lang.String var5 : kotlin.text.h.B0(var2.getText(), new java.lang.String[]{"\n"}, false, 0, 6, null)) {
            INSTANCE.recordBreadcrumb(var5, "Tombstone");
         }

         val var7: SystemLogReport = INSTANCE;
         INSTANCE.recordBreadcrumb(var2.getGroupHash(), "Tombstone-Hash");
         var3 = var7.checkHashChanged(var0, var2.getTextHash());
      } else {
         var3 = false;
      }

      val var8: SystemLogReport.LastSentryCrashCache = SystemLogReport.LastSentryCrashCache.INSTANCE;
      val var6: SystemLogReport.SentryCrashData = SystemLogReport.LastSentryCrashCache.INSTANCE.get(var0);
      val var9: HistoricalProcessExitReason.Reason = HistoricalProcessExitReason.INSTANCE.lastReason(var0);
      if (!var3) {
         var2 = null;
      }

      var1.invoke(var9, var2, var6);
      var8.clear(var0);
      return Unit.a;
   }

   public fun recordSentryCrash(context: Context, event: SentryEvent) {
      var var14: java.lang.String;
      label35: {
         r.h(var1, "context");
         r.h(var2, "event");
         val var3: q = var2.w0();
         if (var3 != null) {
            val var11: v = var3.i();
            if (var11 != null) {
               val var12: java.util.List = var11.d();
               if (var12 != null) {
                  val var13: java.util.List = kotlin.collections.i.E0(var12);
                  if (var13 != null) {
                     var14 = kotlin.collections.i.q0(var13, "\n", null, null, 0, null, new g(), 30, null);
                     break label35;
                  }
               }
            }
         }

         var14 = null;
      }

      val var4: q = var2.w0();
      val var15: java.lang.String;
      if (var4 != null) {
         var15 = var4.h();
      } else {
         var15 = null;
      }

      val var5: q = var2.w0();
      val var17: java.lang.String;
      if (var5 != null) {
         var17 = var5.k();
      } else {
         var17 = null;
      }

      val var8: q = var2.w0();
      val var9: java.lang.String;
      if (var8 != null) {
         var9 = var8.l();
      } else {
         var9 = null;
      }

      val var7: StringBuilder = new StringBuilder();
      var7.append(var15);
      var7.append(".");
      var7.append(var17);
      var7.append(": ");
      var7.append(var9);
      val var18: java.lang.String = var7.toString();
      var var10: java.lang.String = null;
      if (var14 != null) {
         var10 = kotlin.text.h.e1(var14, 1000);
      }

      SystemLogReport.LastSentryCrashCache.INSTANCE.set(var1, new SystemLogReport.SentryCrashData(var18, var10));
   }

   internal fun reportLastCrash(context: Context, cb: (Reason?, Tombstone?, com.discord.crash_reporting.system_logs.SystemLogReport.SentryCrashData?) -> Unit) {
      r.h(var1, "context");
      r.h(var2, "cb");
      SystemLogUtils.INSTANCE.fetchLastTombstone(new f(var1, var2));
   }

   private object LastSentryCrashCache {
      private const val CACHE_KEY: String = "LastSentryCrashCache"

      private final val cache: SharedPreferences
         private final get() {
            val var2: SharedPreferences = var1.getSharedPreferences("LastSentryCrashCache", 0);
            r.g(var2, "getSharedPreferences(...)");
            return var2;
         }


      public fun clear(context: Context) {
         r.h(var1, "context");
         val var2: Editor = this.getCache(var1).edit();
         var2.clear();
         var2.apply();
      }

      public fun get(context: Context): com.discord.crash_reporting.system_logs.SystemLogReport.SentryCrashData {
         r.h(var1, "context");
         return new SystemLogReport.SentryCrashData(this.getCache(var1).getString("message", null), this.getCache(var1).getString("callStack", null));
      }

      public fun set(context: Context, data: com.discord.crash_reporting.system_logs.SystemLogReport.SentryCrashData) {
         r.h(var1, "context");
         r.h(var2, "data");
         val var3: Editor = this.getCache(var1).edit();
         var3.putString("message", var2.getMessage());
         var3.putString("callStack", var2.getCallStackTrace());
         var3.commit();
      }
   }

   private object LastStoredTombstoneCache {
      private const val CACHE_KEY: String = "LastStoredTombstoneCache"

      private final val cache: SharedPreferences
         private final get() {
            val var2: SharedPreferences = var1.getSharedPreferences("LastStoredTombstoneCache", 0);
            r.g(var2, "getSharedPreferences(...)");
            return var2;
         }


      public fun get(context: Context): String? {
         r.h(var1, "context");
         return this.getCache(var1).getString("LastStoredTombstoneCache", null);
      }

      public fun set(context: Context, hash: String) {
         r.h(var1, "context");
         r.h(var2, "hash");
         val var3: Editor = this.getCache(var1).edit();
         var3.putString("LastStoredTombstoneCache", var2);
         var3.apply();
      }
   }

   public data class SentryCrashData(message: String?, callStackTrace: String?) {
      public final val message: String?
      public final val callStackTrace: String?

      init {
         this.message = var1;
         this.callStackTrace = var2;
      }

      public operator fun component1(): String? {
         return this.message;
      }

      public operator fun component2(): String? {
         return this.callStackTrace;
      }

      public fun copy(message: String? = var0.message, callStackTrace: String? = var0.callStackTrace): com.discord.crash_reporting.system_logs.SystemLogReport.SentryCrashData {
         return new SystemLogReport.SentryCrashData(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is SystemLogReport.SentryCrashData) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.message, var1.message)) {
               return false;
            } else {
               return r.c(this.callStackTrace, var1.callStackTrace);
            }
         }
      }

      public override fun hashCode(): Int {
         var var2: Int = 0;
         val var1: Int;
         if (this.message == null) {
            var1 = 0;
         } else {
            var1 = this.message.hashCode();
         }

         if (this.callStackTrace != null) {
            var2 = this.callStackTrace.hashCode();
         }

         return var1 * 31 + var2;
      }

      public override fun toString(): String {
         val var2: java.lang.String = this.message;
         val var1: java.lang.String = this.callStackTrace;
         val var3: StringBuilder = new StringBuilder();
         var3.append("SentryCrashData(message=");
         var3.append(var2);
         var3.append(", callStackTrace=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }
   }
}
