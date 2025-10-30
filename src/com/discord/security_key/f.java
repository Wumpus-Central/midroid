package com.discord.security_key;

// $VF: synthetic class
public final class f implements wf.d {
   public final WebAuthn a;

   @Override
   public final void onFailure(Exception var1) {
      WebAuthn.b(this.a, var1);
   }
}
