package com.discord.react.utilities;

import com.facebook.react.bridge.ReactContext;

public final class a implements Runnable {
   public final ReactContext j;
   public final int k;

   @Override
   public final void run() {
      ReactViewExtensionsKt.a(this.j, this.k);
   }
}
