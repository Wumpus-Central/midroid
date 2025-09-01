package com.discord.deep_link;

import java.util.concurrent.ScheduledExecutorService;

// $VF: synthetic class
public final class a implements Runnable {
   public final ScheduledExecutorService d;

   @Override
   public final void run() {
      DeepLinks.a(this.d);
   }
}
