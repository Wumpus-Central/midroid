package com.discord.crash_reporting.react_events

import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason
import com.discord.crash_reporting.system_logs.SystemLogUtils
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason
import com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import lk.c
import vj.w

internal data class CrashReportEvent(crashedLastRun: Boolean?, reason: Reason?, tombstone: Tombstone?) : ReactEvent {
   private final val crashedLastRun: Boolean?
   private final val reason: Reason?
   private final val tombstone: Tombstone?

   init {
      this.crashedLastRun = var1;
      this.reason = var2;
      this.tombstone = var3;
   }

   private operator fun component1(): Boolean? {
      return this.crashedLastRun;
   }

   private operator fun component2(): Reason? {
      return this.reason;
   }

   private operator fun component3(): Tombstone? {
      return this.tombstone;
   }

   public fun copy(crashedLastRun: Boolean? = var0.crashedLastRun, reason: Reason? = var0.reason, tombstone: Tombstone? = var0.tombstone): CrashReportEvent {
      return new CrashReportEvent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CrashReportEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.crashedLastRun, var1.crashedLastRun)) {
            return false;
         } else if (!q.c(this.reason, var1.reason)) {
            return false;
         } else {
            return q.c(this.tombstone, var1.tombstone);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.crashedLastRun == null) {
         var1 = 0;
      } else {
         var1 = this.crashedLastRun.hashCode();
      }

      val var2: Int;
      if (this.reason == null) {
         var2 = 0;
      } else {
         var2 = this.reason.hashCode();
      }

      if (this.tombstone != null) {
         var3 = this.tombstone.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public open fun serialize(): WritableMap {
      val var1: WritableNativeMap = new WritableNativeMap();
      if (this.crashedLastRun != null) {
         var1.putBoolean("didCrash", this.crashedLastRun);
      }

      val var4: HistoricalProcessExitReason.Reason = this.reason;
      if (this.reason != null) {
         var1.putString("exitReason", this.reason.getReason());
         var1.putString("exitDescription", var4.getReason());
      }

      val var5: SystemLogUtils.Tombstone = this.tombstone;
      if (this.tombstone != null) {
         var1.putString("tombstoneGroupHash", this.tombstone.getGroupHash());
         val var3: java.lang.String = var5.getCause();
         if (var3 != null) {
            var1.putString("tombstoneCause", var3);
         }

         if (f.n(new IntRange(0, 1000), c.j) == 0 && !h.x(var5.getText())) {
            var1.putString("tombstone", h.c1(var5.getText(), 6291456));
         }
      }

      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("reports", NativeArrayExtensionsKt.nativeArrayOf(new Object[]{var1}))});
   }

   public override fun toString(): String {
      val var1: java.lang.Boolean = this.crashedLastRun;
      val var4: HistoricalProcessExitReason.Reason = this.reason;
      val var3: SystemLogUtils.Tombstone = this.tombstone;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CrashReportEvent(crashedLastRun=");
      var2.append(var1);
      var2.append(", reason=");
      var2.append(var4);
      var2.append(", tombstone=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
