package com.discord.security_key;

import hb.e;

public final class b implements e {
   public final WebAuthn a;

   public final void onFailure(Exception var1) {
      WebAuthn.d(this.a, var1);
   }
}
