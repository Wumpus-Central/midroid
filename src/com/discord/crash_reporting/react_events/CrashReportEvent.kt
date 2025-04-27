package com.discord.crash_reporting.react_events

import A8.c
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason
import com.discord.crash_reporting.system_logs.SystemLogReport
import com.discord.crash_reporting.system_logs.SystemLogUtils
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason.Reason
import com.discord.crash_reporting.system_logs.SystemLogReport.SentryCrashData
import com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import j8.w
import kotlin.jvm.internal.q

internal data class CrashReportEvent(crashedLastRun: Boolean?, sentryData: SentryCrashData?, reason: Reason?, tombstone: Tombstone?) : ReactEvent {
   private final val crashedLastRun: Boolean?
   private final val reason: Reason?
   private final val sentryData: SentryCrashData?
   private final val tombstone: Tombstone?

   init {
      this.crashedLastRun = var1;
      this.sentryData = var2;
      this.reason = var3;
      this.tombstone = var4;
   }

   private operator fun component1(): Boolean? {
      return this.crashedLastRun;
   }

   private operator fun component2(): SentryCrashData? {
      return this.sentryData;
   }

   private operator fun component3(): Reason? {
      return this.reason;
   }

   private operator fun component4(): Tombstone? {
      return this.tombstone;
   }

   public fun copy(
      crashedLastRun: Boolean? = var0.crashedLastRun,
      sentryData: SentryCrashData? = var0.sentryData,
      reason: Reason? = var0.reason,
      tombstone: Tombstone? = var0.tombstone
   ): CrashReportEvent {
      return new CrashReportEvent(var1, var2, var3, var4);
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
         } else if (!q.c(this.sentryData, var1.sentryData)) {
            return false;
         } else if (!q.c(this.reason, var1.reason)) {
            return false;
         } else {
            return q.c(this.tombstone, var1.tombstone);
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.crashedLastRun == null) {
         var1 = 0;
      } else {
         var1 = this.crashedLastRun.hashCode();
      }

      val var2: Int;
      if (this.sentryData == null) {
         var2 = 0;
      } else {
         var2 = this.sentryData.hashCode();
      }

      val var3: Int;
      if (this.reason == null) {
         var3 = 0;
      } else {
         var3 = this.reason.hashCode();
      }

      if (this.tombstone != null) {
         var4 = this.tombstone.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun serialize(): WritableMap {
      val var1: WritableNativeMap = new WritableNativeMap();
      if (this.crashedLastRun != null) {
         var1.putBoolean("didCrash", this.crashedLastRun);
      }

      val var4: SystemLogReport.SentryCrashData = this.sentryData;
      if (this.sentryData != null) {
         var1.putString("exceptionMessage", this.sentryData.getMessage());
         var1.putString("exceptionStacktrace", var4.getCallStackTrace());
      }

      val var5: HistoricalProcessExitReason.Reason = this.reason;
      if (this.reason != null) {
         var1.putString("exitReason", this.reason.getReason());
         var1.putString("exitDescription", var5.getReason());
      }

      val var3: SystemLogUtils.Tombstone = this.tombstone;
      if (this.tombstone != null) {
         var1.putString("tombstoneGroupHash", this.tombstone.getGroupHash());
         val var6: java.lang.String = var3.getCause();
         if (var6 != null) {
            var1.putString("tombstoneCause", var6);
         }

         if (d.n(new IntRange(0, 1000), c.j) == 0 && !h.d0(var3.getText())) {
            var1.putString("tombstone", h.f1(var3.getText(), 6291456));
         }
      }

      return NativeMapExtensionsKt.nativeMapOf(w.a("reports", NativeArrayExtensionsKt.nativeArrayOf(var1)));
   }

   public override fun toString(): String {
      val var1: java.lang.Boolean = this.crashedLastRun;
      val var5: SystemLogReport.SentryCrashData = this.sentryData;
      val var2: HistoricalProcessExitReason.Reason = this.reason;
      val var3: SystemLogUtils.Tombstone = this.tombstone;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CrashReportEvent(crashedLastRun=");
      var4.append(var1);
      var4.append(", sentryData=");
      var4.append(var5);
      var4.append(", reason=");
      var4.append(var2);
      var4.append(", tombstone=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }
}
