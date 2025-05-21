package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class b implements NativeConnection.MLSPairwiseFingerprintCallback {
   public final Function1 a;

   @Override
   public final void onMLSPairwiseFingerprint(String var1) {
      MediaEngine.h(this.a, var1);
   }
}
