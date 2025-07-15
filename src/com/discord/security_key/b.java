package com.discord.security_key;

import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class b implements u6.f {
   public final Function1 a;

   public final void onSuccess(Object var1) {
      WebAuthn.e(this.a, var1);
   }
}
