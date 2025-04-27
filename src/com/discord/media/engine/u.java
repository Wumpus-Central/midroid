package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class u implements NativeConnection.MLSFailureCallback {
   public final Function2 a;

   @Override
   public final void onMLSFailureCallback(String var1, String var2) {
      MediaEngine.o(this.a, var1, var2);
   }
}
