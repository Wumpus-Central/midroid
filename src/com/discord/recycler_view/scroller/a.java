package com.discord.recycler_view.scroller;

import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class a implements Runnable {
   public final Scroller j;
   public final int k;
   public final Scroller.TargetAlignment l;
   public final Function0 m;
   public final Function0 n;
   public final Function0 o;
   public final int p;

   @Override
   public final void run() {
      Scroller.c(this.j, this.k, this.l, this.m, this.n, this.o, this.p);
   }
}
