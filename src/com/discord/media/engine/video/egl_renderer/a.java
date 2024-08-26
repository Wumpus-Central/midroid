package com.discord.media.engine.video.egl_renderer;

import java.util.concurrent.CountDownLatch;

public final class a implements Runnable {
   public final EglRenderer j;
   public final CountDownLatch k;

   @Override
   public final void run() {
      EglRenderer.c(this.j, this.k);
   }
}
