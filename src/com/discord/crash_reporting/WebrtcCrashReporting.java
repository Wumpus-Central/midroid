package com.discord.crash_reporting;

import io.sentry.n3;

class WebrtcCrashReporting {
   static String reportWebrtcException(Throwable var0) {
      n3.h(var0);
      return var0.toString();
   }
}
