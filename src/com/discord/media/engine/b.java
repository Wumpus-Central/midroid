package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class b implements NativeConnection.OnFirstFrameCallback {
   public final Function3 a;

   @Override
   public final void onFirstFrame(String var1, long var2, String var4) {
      MediaEngine.d(this.a, var1, var2, var4);
   }
}
