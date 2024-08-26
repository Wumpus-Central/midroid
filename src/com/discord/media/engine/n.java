package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.MLSProcessProposalsCallback;
import kotlin.jvm.functions.Function1;

public final class n implements MLSProcessProposalsCallback {
   public final Function1 a;

   public final void onMLSCommitWelcome(String var1) {
      MediaEngine.n(this.a, var1);
   }
}
