package com.discord.crash_reporting.system_logs

import android.app.ActivityManager
import android.app.ApplicationExitInfo
import android.content.Context
import android.os.Build.VERSION
import f2.e
import f2.f
import f2.g
import kh.w
import kotlin.jvm.internal.q
import lh.r

internal object HistoricalProcessExitReason {
   private final val exitReasonLookup: Map<Int, String>

   @JvmStatic
   fun {
      val var0: java.util.Map;
      if (VERSION.SDK_INT < 30) {
         var0 = r.h();
      } else {
         var0 = r.l(
            new Pair[]{
               w.a(6, "ANR"),
               w.a(4, "CRASH"),
               w.a(5, "CRASH_NATIVE"),
               w.a(12, "DEPENDENCY_DIED"),
               w.a(9, "EXCESSIVE_RESOURCE_USAGE"),
               w.a(1, "EXIT_SELF"),
               w.a(7, "INITIALIZATION_FAILURE"),
               w.a(3, "LOW_MEMORY"),
               w.a(13, "OTHER"),
               w.a(8, "PERMISSION_CHANGE"),
               w.a(2, "SIGNALED"),
               w.a(0, "UNKNOWN"),
               w.a(10, "USER_REQUESTED"),
               w.a(11, "USER_STOPPED")
            }
         );
      }

      exitReasonLookup = var0;
   }

   public fun lastReason(context: Context): com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason? {
      q.h(var1, "context");
      if (VERSION.SDK_INT < 30) {
         return null;
      } else {
         var var5: StringBuilder = (StringBuilder)var1.getSystemService("activity");
         if (var5 is ActivityManager) {
            var5 = var5 as ActivityManager;
         } else {
            var5 = null;
         }

         if (var5 == null) {
            return null;
         } else {
            var5 = e.a((ActivityManager)var5, null, 0, 1);
            q.g(var5, "getHistoricalProcessExitReasons(...)");
            val var4: ApplicationExitInfo = f.a(i.g0((java.util.List)var5));
            if (var4 == null) {
               return null;
            } else {
               val var3: java.lang.String = exitReasonLookup.get(g.a(var4));
               var5 = var3;
               if (var3 == null) {
                  val var2: Int = g.a(var4);
                  var5 = new StringBuilder();
                  var5.append("Unknown ");
                  var5.append(var2);
                  var5 = var5.toString();
               }

               return new HistoricalProcessExitReason.Reason((java.lang.String)var5, c.a(var4));
            }
         }
      }
   }

   public data class Reason(reason: String, description: String?) {
      public final val description: String?
      public final val reason: String

      init {
         q.h(var1, "reason");
         super();
         this.reason = var1;
         this.description = var2;
      }

      public operator fun component1(): String {
         return this.reason;
      }

      public operator fun component2(): String? {
         return this.description;
      }

      public fun copy(reason: String = var0.reason, description: String? = var0.description): com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason {
         q.h(var1, "reason");
         return new HistoricalProcessExitReason.Reason(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is HistoricalProcessExitReason.Reason) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.reason, var1.reason)) {
               return false;
            } else {
               return q.c(this.description, var1.description);
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.reason.hashCode();
         val var1: Int;
         if (this.description == null) {
            var1 = 0;
         } else {
            var1 = this.description.hashCode();
         }

         return var2 * 31 + var1;
      }

      public override fun toString(): String {
         val var1: java.lang.String = this.reason;
         val var2: java.lang.String = this.description;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Reason(reason=");
         var3.append(var1);
         var3.append(", description=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
