package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class p implements NativeEngine.GetRankedRtcRegionsCallback {
   public final Function1 a;

   @Override
   public final void onRankedRtcRegions(String[] var1) {
      MediaEngine.u(this.a, var1);
   }
}
