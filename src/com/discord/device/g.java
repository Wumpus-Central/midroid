package com.discord.device;

import android.os.PowerManager.OnThermalStatusChangedListener;

public final class g implements OnThermalStatusChangedListener {
   public final DeviceThermalStateManagerModule a;

   public final void onThermalStatusChanged(int var1) {
      DeviceThermalStateManagerModule.a(this.a, var1);
   }
}
