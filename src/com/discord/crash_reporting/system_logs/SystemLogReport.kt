package com.discord.crash_reporting.system_logs

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason
import com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone
import com.discord.logging.Log
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
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
      val var4: Log = Log.INSTANCE;
      val var3: java.lang.String = TAG;
      r.g(TAG, "TAG");
      val var5: StringBuilder = new StringBuilder();
      var5.append("Breadcrumb, [");
      var5.append(var2);
      var5.append("]: ");
      var5.append(var1);
      Log.i$default(var4, var3, var5.toString(), null, 4, null);
   }

   internal fun reportLastCrash(context: Context, cb: (Reason?, Tombstone?) -> Unit) {
      r.h(var1, "context");
      r.h(var2, "cb");
      SystemLogUtils.INSTANCE.fetchLastTombstone(new Function1<SystemLogUtils.Tombstone, Unit>(var2, var1) {
         final Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit> $cb;
         final Context $context;

         {
            super(1);
            this.$cb = var1;
            this.$context = var2;
         }

         public final void invoke(SystemLogUtils.Tombstone var1) {
            val var2: Boolean;
            if (var1 != null) {
               val var3: Context = this.$context;

               for (java.lang.String var5 : f.A0(var1.getText(), new java.lang.String[]{"\n"}, false, 0, 6, null)) {
                  SystemLogReport.access$recordBreadcrumb(SystemLogReport.INSTANCE, var5, "Tombstone");
               }

               val var7: SystemLogReport = SystemLogReport.INSTANCE;
               SystemLogReport.access$recordBreadcrumb(SystemLogReport.INSTANCE, var1.getGroupHash(), "Tombstone-Hash");
               var2 = SystemLogReport.access$checkHashChanged(var7, var3, var1.getTextHash());
            } else {
               var2 = false;
            }

            val var8: Function2 = this.$cb;
            val var6: HistoricalProcessExitReason.Reason = HistoricalProcessExitReason.INSTANCE.lastReason(this.$context);
            if (!var2) {
               var1 = null;
            }

            var8.invoke(var6, var1);
         }
      });
   }

   private object LastStoredTombstoneCache {
      private const val CACHE_KEY: String = "LastStoredTombstoneCache"

      private final val cache: SharedPreferences
         private final get() {
            val var2: SharedPreferences = var1.getSharedPreferences("LastStoredTombstoneCache", 0);
            r.g(var2, "getSharedPreferences(CAC…EY, Context.MODE_PRIVATE)");
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
         r.g(var3, "editor");
         var3.putString("LastStoredTombstoneCache", var2);
         var3.apply();
      }
   }
}
