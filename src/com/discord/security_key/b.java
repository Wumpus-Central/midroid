package com.discord.security_key;

import cd.g;

// $VF: synthetic class
public final class b implements g {
   public final WebAuthn a;

   @Override
   public final void onFailure(Exception var1) {
      WebAuthn.d(this.a, var1);
   }
}
