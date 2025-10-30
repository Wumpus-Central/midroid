package com.discord.security_key;

import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class e implements wf.e {
   public final Function1 a;

   @Override
   public final void onSuccess(Object var1) {
      WebAuthn.c(this.a, var1);
   }
}
