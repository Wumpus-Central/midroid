package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class e implements NativeConnection.GetStatsCallback {
   public final Function1 a;

   @Override
   public final void onStats(String var1) {
      MediaEngine.u(this.a, var1);
   }
}
