package com.discord.crash_reporting.system_logs;

import io.sentry.protocol.SentryStackFrame;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class d implements Function1 {
   public final Object invoke(Object var1) {
      return SystemLogReport.b((SentryStackFrame)var1);
   }
}
