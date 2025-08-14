package com.discord.media.engine.video.egl_renderer;

import java.util.concurrent.CountDownLatch;

// $VF: synthetic class
public final class d implements Runnable {
   public final EglRenderer d;
   public final CountDownLatch e;

   @Override
   public final void run() {
      EglRenderer.a(this.d, this.e);
   }
}
