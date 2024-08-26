package com.discord.device;

import com.facebook.react.bridge.ReadableArray;

public final class d implements Runnable {
   public final DeviceSettingsManagerModule j;
   public final ReadableArray k;

   @Override
   public final void run() {
      DeviceSettingsManagerModule.a(this.j, this.k);
   }
}
