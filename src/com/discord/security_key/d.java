package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class d implements Function1 {
   public final Activity d;

   public final Object invoke(Object var1) {
      return WebAuthn.c(this.d, (PendingIntent)var1);
   }
}
