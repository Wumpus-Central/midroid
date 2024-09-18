package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class u implements NativeConnection.SecureFramesTransitionReadyCallback {
   public final Function0 a;

   @Override
   public final void onTransitionReady() {
      MediaEngine.k(this.a);
   }
}
