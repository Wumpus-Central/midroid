package com.discord.timers;

import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class a implements Runnable {
   public final TimersManager j;
   public final int k;
   public final Function0 l;

   @Override
   public final void run() {
      TimersManager.a(this.j, this.k, this.l);
   }
}
