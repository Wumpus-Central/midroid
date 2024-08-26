package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.GetStatsCallback;
import kotlin.jvm.functions.Function1;

public final class p implements GetStatsCallback {
   public final Function1 a;

   public final void onStats(String var1) {
      MediaEngine.c(this.a, var1);
   }
}
