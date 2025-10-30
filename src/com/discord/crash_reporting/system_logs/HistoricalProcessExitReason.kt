package com.discord.crash_reporting.system_logs

import android.app.ActivityManager
import android.app.ApplicationExitInfo
import android.content.Context
import android.os.Build.VERSION
import fm.v

internal object HistoricalProcessExitReason {
   private final val exitReasonLookup: Map<Int, String>

   @JvmStatic
   fun {
      val var0: java.util.Map;
      if (VERSION.SDK_INT < 30) {
         var0 = n0.i();
      } else {
         var0 = n0.m(
            new Pair[]{
               v.a(6, "ANR"),
               v.a(4, "CRASH"),
               v.a(5, "CRASH_NATIVE"),
               v.a(12, "DEPENDENCY_DIED"),
               v.a(9, "EXCESSIVE_RESOURCE_USAGE"),
               v.a(1, "EXIT_SELF"),
               v.a(7, "INITIALIZATION_FAILURE"),
               v.a(3, "LOW_MEMORY"),
               v.a(13, "OTHER"),
               v.a(8, "PERMISSION_CHANGE"),
               v.a(2, "SIGNALED"),
               v.a(0, "UNKNOWN"),
               v.a(10, "USER_REQUESTED"),
               v.a(11, "USER_STOPPED")
            }
         );
      }

      exitReasonLookup = var0;
   }

   public fun lastReason(context: Context): com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason? {
      if (VERSION.SDK_INT < 30) {
         return null;
      } else {
         var var5: ActivityManager = (ActivityManager)var1.getSystemService("activity");
         if (var5 is ActivityManager) {
            var5 = var5;
         } else {
            var5 = null;
         }

         if (var5 == null) {
            return null;
         } else {
            val var7: java.util.List = var5.getHistoricalProcessExitReasons(null, 0, 1);
            val var4: ApplicationExitInfo = q4.e.a(CollectionsKt.firstOrNull(var7));
            if (var4 == null) {
               return null;
            } else {
               val var3: java.lang.String = exitReasonLookup.get(var4.getReason());
               var var8: java.lang.String = var3;
               if (var3 == null) {
                  val var2: Int = var4.getReason();
                  val var9: StringBuilder = new StringBuilder();
                  var9.append("Unknown ");
                  var9.append(var2);
                  var8 = var9.toString();
               }

               return new HistoricalProcessExitReason.Reason(var8, var4.getDescription());
            }
         }
      }
   }

   public data class Reason(reason: String, description: String?) {
      public final val reason: String
      public final val description: String?

      init {
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
         return new HistoricalProcessExitReason.Reason(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is HistoricalProcessExitReason.Reason) {
            return false;
         } else {
            var1 = var1;
            if (!(this.reason == var1.reason)) {
               return false;
            } else {
               return this.description == var1.description;
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
