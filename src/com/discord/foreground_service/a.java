package com.discord.foreground_service;

import android.app.Service;
import android.content.Context;

// $VF: synthetic class
public final class a implements Runnable {
   public final Context j;
   public final Service k;

   @Override
   public final void run() {
      ForegroundService.Companion.a(this.j, this.k);
   }
}
