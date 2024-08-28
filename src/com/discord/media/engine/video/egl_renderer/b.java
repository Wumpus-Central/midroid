package com.discord.media.engine.video.egl_renderer;

import android.os.Looper;

// $VF: synthetic class
public final class b implements Runnable {
   public final EglRenderer j;
   public final Looper k;

   @Override
   public final void run() {
      EglRenderer.a(this.j, this.k);
   }
}
