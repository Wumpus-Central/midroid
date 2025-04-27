package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class d implements NativeConnection.MLSWelcomeCallback {
   public final Function3 a;

   @Override
   public final void onMLSProcessedWelcome(boolean var1, int var2, String var3) {
      MediaEngine.e(this.a, var1, var2, var3);
   }
}
