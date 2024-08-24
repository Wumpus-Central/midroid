package com.discord.crash_reporting;

import io.sentry.o3;

class WebrtcCrashReporting {
   static String reportWebrtcException(Throwable var0) {
      o3.h(var0);
      return var0.toString();
   }
}
