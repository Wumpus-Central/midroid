package com.discord.recycler_view.scroller;

import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class a implements Runnable {
   public final Scroller d;
   public final int e;
   public final Scroller.TargetAlignment i;
   public final Function0 t;
   public final Function0 u;
   public final Function0 v;
   public final int w;

   @Override
   public final void run() {
      Scroller.c(this.d, this.e, this.i, this.t, this.u, this.v, this.w);
   }
}
