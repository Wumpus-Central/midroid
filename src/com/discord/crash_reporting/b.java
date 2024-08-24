package com.discord.crash_reporting;

import io.sentry.Scope;
import io.sentry.n2;

// $VF: synthetic class
public final class b implements n2 {
   public final String a;
   public final String b;
   public final CrashReporting.ErrorLevel c;

   public final void a(Scope var1) {
      CrashReporting.a(this.a, this.b, this.c, var1);
   }
}
