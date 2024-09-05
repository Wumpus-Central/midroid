package com.discord.security_key;

import kotlin.jvm.functions.Function1;
import md.h;

// $VF: synthetic class
public final class c implements h {
   public final Function1 a;

   @Override
   public final void onSuccess(Object var1) {
      WebAuthn.b(this.a, var1);
   }
}
