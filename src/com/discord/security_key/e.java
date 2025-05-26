package com.discord.security_key;

import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class e implements g6.f {
   public final Function1 a;

   public final void onSuccess(Object var1) {
      WebAuthn.b(this.a, var1);
   }
}
