package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.MLSCommitTransitionCallback;
import kotlin.jvm.functions.Function3;

public final class x implements MLSCommitTransitionCallback {
   public final Function3 a;

   public final void onMLSProcessedCommit(boolean var1, int var2, String var3) {
      MediaEngine.i(this.a, var1, var2, var3);
   }
}
