package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class z implements NativeConnection.MLSCommitTransitionCallback {
   public final Function3 a;

   @Override
   public final void onMLSProcessedCommit(boolean var1, int var2, String var3) {
      MediaEngine.j(this.a, var1, var2, var3);
   }
}
