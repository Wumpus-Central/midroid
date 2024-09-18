package com.discord.device;

import com.facebook.react.bridge.ReadableArray;

// $VF: synthetic class
public final class d implements Runnable {
   public final DeviceSettingsManagerModule j;
   public final ReadableArray k;

   @Override
   public final void run() {
      DeviceSettingsManagerModule.b(this.j, this.k);
   }
}
