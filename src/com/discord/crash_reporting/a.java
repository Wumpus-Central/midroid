package com.discord.crash_reporting;

import android.content.Context;
import io.sentry.k4;
import io.sentry.android.core.SentryAndroidOptions;
import kotlin.jvm.internal.Ref.ObjectRef;

// $VF: synthetic class
public final class a implements io.sentry.w2.a {
   public final ObjectRef a;
   public final String b;
   public final Context c;
   public final double d;

   public final void a(k4 var1) {
      CrashReporting.b(this.a, this.b, this.c, this.d, (SentryAndroidOptions)var1);
   }
}
