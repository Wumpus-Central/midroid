package com.discord.security_key;

import kotlin.jvm.functions.Function1;
import ob.f;

// $VF: synthetic class
public final class a implements f {
   public final Function1 a;

   public final void onSuccess(Object var1) {
      WebAuthn.a(this.a, var1);
   }
}
