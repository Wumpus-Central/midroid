package com.discord.security_key;

// $VF: synthetic class
public final class c implements wf.d {
   public final WebAuthn a;

   @Override
   public final void onFailure(Exception var1) {
      WebAuthn.d(this.a, var1);
   }
}
