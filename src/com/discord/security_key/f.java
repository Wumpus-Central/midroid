package com.discord.security_key;

// $VF: synthetic class
public final class f implements z7.d {
   public final WebAuthn a;

   @Override
   public final void onFailure(Exception var1) {
      WebAuthn.a(this.a, var1);
   }
}
