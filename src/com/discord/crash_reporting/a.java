package com.discord.crash_reporting;

import android.content.Context;
import io.sentry.Hint;
import io.sentry.SentryEvent;

// $VF: synthetic class
public final class a implements io.sentry.l5.d {
   public final Context a;

   public final SentryEvent a(SentryEvent var1, Hint var2) {
      return CrashReporting.c(this.a, var1, var2);
   }
}
