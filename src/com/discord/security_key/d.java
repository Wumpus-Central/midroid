package com.discord.security_key;

import cd.g;

// $VF: synthetic class
public final class d implements g {
   public final WebAuthn a;

   @Override
   public final void onFailure(Exception var1) {
      WebAuthn.c(this.a, var1);
   }
}
