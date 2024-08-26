package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.MLSWelcomeCallback;
import kotlin.jvm.functions.Function3;

public final class m implements MLSWelcomeCallback {
   public final Function3 a;

   public final void onMLSProcessedWelcome(boolean var1, int var2, String var3) {
      MediaEngine.g(this.a, var1, var2, var3);
   }
}
