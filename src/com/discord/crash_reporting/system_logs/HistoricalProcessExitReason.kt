package com.discord.crash_reporting.system_logs

import android.app.ActivityManager
import android.app.ApplicationExitInfo
import android.content.Context
import android.os.Build.VERSION
import t9.s
import u9.q

internal object HistoricalProcessExitReason {
   private final val exitReasonLookup: Map<Int, String>

   @JvmStatic
   fun {
      val var0: java.util.Map;
      if (VERSION.SDK_INT < 30) {
         var0 = q.h();
      } else {
         var0 = q.l(
            new Pair[]{
               s.a(6, "ANR"),
               s.a(4, "CRASH"),
               s.a(5, "CRASH_NATIVE"),
               s.a(12, "DEPENDENCY_DIED"),
               s.a(9, "EXCESSIVE_RESOURCE_USAGE"),
               s.a(1, "EXIT_SELF"),
               s.a(7, "INITIALIZATION_FAILURE"),
               s.a(3, "LOW_MEMORY"),
               s.a(13, "OTHER"),
               s.a(8, "PERMISSION_CHANGE"),
               s.a(2, "SIGNALED"),
               s.a(0, "UNKNOWN"),
               s.a(10, "USER_REQUESTED"),
               s.a(11, "USER_STOPPED")
            }
         );
      }

      exitReasonLookup = var0;
   }

   public fun lastReason(context: Context): com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason? {
      kotlin.jvm.internal.q.h(var1, "context");
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
            var5 = L0.e.a((ActivityManager)var5, null, 0, 1);
            kotlin.jvm.internal.q.g(var5, "getHistoricalProcessExitReasons(...)");
            val var4: ApplicationExitInfo = L0.f.a(kotlin.collections.i.h0((java.util.List)var5));
            if (var4 == null) {
               return null;
            } else {
               val var3: java.lang.String = exitReasonLookup.get(L0.g.a(var4));
               var5 = var3;
               if (var3 == null) {
                  val var2: Int = L0.g.a(var4);
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
      public final val reason: String
      public final val description: String?

      init {
         kotlin.jvm.internal.q.h(var1, "reason");
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
         kotlin.jvm.internal.q.h(var1, "reason");
         return new HistoricalProcessExitReason.Reason(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is HistoricalProcessExitReason.Reason) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.q.c(this.reason, var1.reason)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.description, var1.description);
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
         val var3: java.lang.String = this.reason;
         val var2: java.lang.String = this.description;
         val var1: StringBuilder = new StringBuilder();
         var1.append("Reason(reason=");
         var1.append(var3);
         var1.append(", description=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }
}
