package com.discord.device;

public final class c implements Runnable {
   public final DeviceSettingsManagerModule j;
   public final boolean k;
   public final int l;

   @Override
   public final void run() {
      DeviceSettingsManagerModule.b(this.j, this.k, this.l);
   }
}
