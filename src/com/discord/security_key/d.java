package com.discord.security_key;

import hb.e;

public final class d implements e {
   public final WebAuthn a;

   public final void onFailure(Exception var1) {
      WebAuthn.c(this.a, var1);
   }
}
