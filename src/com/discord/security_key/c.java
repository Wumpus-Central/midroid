package com.discord.security_key;

// $VF: synthetic class
public final class c implements t7.d {
   public final WebAuthn a;

   @Override
   public final void onFailure(Exception var1) {
      WebAuthn.f(this.a, var1);
   }
}
