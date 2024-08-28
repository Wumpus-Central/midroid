package com.discord.self_measured_view;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.FabricViewStateManager;

// $VF: synthetic class
public final class a implements FabricViewStateManager.StateUpdateCallback {
   public final float a;
   public final float b;

   @Override
   public final WritableMap getStateUpdate() {
      return SelfMeasuredView.c(this.a, this.b);
   }
}
