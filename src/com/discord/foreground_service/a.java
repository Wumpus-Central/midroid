package com.discord.foreground_service;

import android.app.Service;
import android.content.Context;

// $VF: synthetic class
public final class a implements Runnable {
   public final Context d;
   public final Service e;

   @Override
   public final void run() {
      ForegroundService.Companion.a(this.d, this.e);
   }
}
