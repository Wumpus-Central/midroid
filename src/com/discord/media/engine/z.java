package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class z implements NativeConnection.SecureFramesStateUpdateCallback {
   public final Function1 a;

   @Override
   public final void onSecureFramesStateUpdateCallback(String var1) {
      MediaEngine.n(this.a, var1);
   }
}
