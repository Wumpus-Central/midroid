package com.discord.security_key;

import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class b implements gi.g {
   public final Function1 a;

   public final void onSuccess(Object var1) {
      WebAuthn.f(this.a, var1);
   }
}
