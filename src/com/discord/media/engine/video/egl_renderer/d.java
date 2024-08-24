package com.discord.media.engine.video.egl_renderer;

import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class d implements Runnable {
   public final EglRenderer j;
   public final Function0 k;

   @Override
   public final void run() {
      EglRenderer.e(this.j, this.k);
   }
}
