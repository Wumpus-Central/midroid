package com.discord.crash_reporting;

import io.sentry.IScope;
import io.sentry.c3;

// $VF: synthetic class
public final class b implements c3 {
   public final String a;
   public final String b;
   public final CrashReporting.ErrorLevel c;

   public final void a(IScope var1) {
      CrashReporting.a(this.a, this.b, this.c, var1);
   }
}
