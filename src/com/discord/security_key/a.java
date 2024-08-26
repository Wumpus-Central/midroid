package com.discord.security_key;

import hb.f;
import kotlin.jvm.functions.Function1;

public final class a implements f {
   public final Function1 a;

   public final void onSuccess(Object var1) {
      WebAuthn.a(this.a, var1);
   }
}
