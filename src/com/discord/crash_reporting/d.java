package com.discord.crash_reporting;

import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogReport;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class d implements Function3 {
   public final CrashReportingModule j;

   public final Object invoke(Object var1, Object var2, Object var3) {
      return CrashReportingModule.a(this.j, (HistoricalProcessExitReason.Reason)var1, (SystemLogUtils.Tombstone)var2, (SystemLogReport.SentryCrashData)var3);
   }
}
