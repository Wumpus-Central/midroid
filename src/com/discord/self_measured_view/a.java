package com.discord.self_measured_view;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.FabricViewStateManager.StateUpdateCallback;

public final class a implements StateUpdateCallback {
   public final float a;
   public final float b;

   public final WritableMap getStateUpdate() {
      return SelfMeasuredView.c(this.a, this.b);
   }
}
