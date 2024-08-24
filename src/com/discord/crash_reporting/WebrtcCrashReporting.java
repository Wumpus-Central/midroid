package com.discord.crash_reporting;

import io.sentry.w2;

class WebrtcCrashReporting {
   static String reportWebrtcException(Throwable var0) {
      w2.g(var0);
      return var0.toString();
   }
}
