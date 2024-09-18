package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class k implements NativeConnection.MLSKeyPackageCallback {
   public final Function1 a;

   @Override
   public final void onMLSKeyPackage(String var1) {
      MediaEngine.q(this.a, var1);
   }
}
