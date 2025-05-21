package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements Function1 {
   public final Activity j;

   public final Object invoke(Object var1) {
      return WebAuthn.d(this.j, (PendingIntent)var1);
   }
}
