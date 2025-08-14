package com.discord.device;

import com.facebook.react.bridge.ReadableArray;

// $VF: synthetic class
public final class c implements Runnable {
   public final DeviceSettingsModule d;
   public final ReadableArray e;

   @Override
   public final void run() {
      DeviceSettingsModule.a(this.d, this.e);
   }
}
