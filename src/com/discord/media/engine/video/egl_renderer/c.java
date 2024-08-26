package com.discord.media.engine.video.egl_renderer;

public final class c implements Runnable {
   public final EglRenderer j;
   public final long k;

   @Override
   public final void run() {
      EglRenderer.f(this.j, this.k);
   }
}
