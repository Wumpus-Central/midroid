package com.discord.device;

import android.os.PowerManager.OnThermalStatusChangedListener;

// $VF: synthetic class
public final class f implements OnThermalStatusChangedListener {
   public final DeviceThermalStateModule a;

   public final void onThermalStatusChanged(int var1) {
      DeviceThermalStateModule.a(this.a, var1);
   }
}
