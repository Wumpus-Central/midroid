package com.discord.media.engine;

import com.discord.native.engine.NativeEngine.GetRankedRtcRegionsCallback;
import kotlin.jvm.functions.Function1;

public final class o implements GetRankedRtcRegionsCallback {
   public final Function1 a;

   public final void onRankedRtcRegions(String[] var1) {
      MediaEngine.t(this.a, var1);
   }
}
