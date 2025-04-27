package com.discord.self_measured_view;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.FabricViewStateManager.StateUpdateCallback;

// $VF: synthetic class
public final class b implements StateUpdateCallback {
   public final float a;
   public final float b;

   public final WritableMap getStateUpdate() {
      return SelfMeasuredView.a(this.a, this.b);
   }
}
