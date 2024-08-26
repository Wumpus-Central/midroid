package com.discord.device;

import com.facebook.react.bridge.ReadableArray;

public final class b implements Runnable {
   public final ReadableArray j;
   public final DeviceAccessibilityModule k;

   @Override
   public final void run() {
      DeviceAccessibilityModule.b(this.j, this.k);
   }
}
