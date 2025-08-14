package com.discord.ads;

import com.google.common.util.concurrent.SettableFuture;

// $VF: synthetic class
public final class a implements Runnable {
   public final SettableFuture d;
   public final AdsModule e;

   @Override
   public final void run() {
      AdsModule.a(this.d, this.e);
   }
}
