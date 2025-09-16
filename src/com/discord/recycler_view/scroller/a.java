package com.discord.recycler_view.scroller;

import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class a implements Runnable {
   public final Scroller d;
   public final int e;
   public final Scroller.TargetAlignment i;
   public final Function0 m;
   public final Function0 n;
   public final Function0 o;
   public final int p;

   @Override
   public final void run() {
      Scroller.c(this.d, this.e, this.i, this.m, this.n, this.o, this.p);
   }
}
