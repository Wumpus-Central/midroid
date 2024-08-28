package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class o implements NativeEngine.GetRankedRtcRegionsCallback {
   public final Function1 a;

   @Override
   public final void onRankedRtcRegions(String[] var1) {
      MediaEngine.t(this.a, var1);
   }
}
