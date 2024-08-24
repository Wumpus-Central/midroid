package com.discord.crash_reporting;

import android.content.Context;
import io.sentry.j5;
import io.sentry.android.core.SentryAndroidOptions;
import kotlin.jvm.internal.Ref.ObjectRef;

// $VF: synthetic class
public final class a implements io.sentry.o3.a {
   public final ObjectRef a;
   public final String b;
   public final Context c;
   public final double d;

   public final void a(j5 var1) {
      CrashReporting.b(this.a, this.b, this.c, this.d, (SentryAndroidOptions)var1);
   }
}
