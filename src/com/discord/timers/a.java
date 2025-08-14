package com.discord.timers;

import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class a implements Runnable {
   public final TimersManager d;
   public final int e;
   public final Function0 i;

   @Override
   public final void run() {
      TimersManager.a(this.d, this.e, this.i);
   }
}
