package com.discord.external_pip;

import kotlin.jvm.functions.Function0;

public final class e implements Runnable {
   public final ExternalPipTransitionView j;
   public final long k;
   public final Function0 l;

   @Override
   public final void run() {
      ExternalPipTransitionView.a(this.j, this.k, this.l);
   }
}
