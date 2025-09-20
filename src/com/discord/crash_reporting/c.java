package com.discord.crash_reporting;

import android.content.Context;
import io.sentry.m2;
import io.sentry.android.core.SentryAndroidOptions;

// $VF: synthetic class
public final class c implements io.sentry.p1.a {
   public final String a;
   public final String b;
   public final Context c;
   public final double d;

   public final void a(m2 var1) {
      CrashReporting.a(this.a, this.b, this.c, this.d, (SentryAndroidOptions)var1);
   }
}
