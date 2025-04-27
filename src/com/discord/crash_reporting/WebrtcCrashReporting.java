package com.discord.crash_reporting;

import io.sentry.p1;

class WebrtcCrashReporting {
   static String reportWebrtcException(Throwable var0) {
      p1.i(var0);
      return var0.toString();
   }
}
