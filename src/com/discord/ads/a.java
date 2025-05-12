package com.discord.ads;

import com.google.common.util.concurrent.SettableFuture;

// $VF: synthetic class
public final class a implements Runnable {
   public final SettableFuture j;
   public final AdsModule k;

   @Override
   public final void run() {
      AdsModule.a(this.j, this.k);
   }
}
