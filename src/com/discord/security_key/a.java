package com.discord.security_key;

import cd.h;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements h {
   public final Function1 a;

   @Override
   public final void onSuccess(Object var1) {
      WebAuthn.a(this.a, var1);
   }
}
