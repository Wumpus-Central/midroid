package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.SecureFramesTransitionReadyCallback;
import kotlin.jvm.functions.Function0;

public final class u implements SecureFramesTransitionReadyCallback {
   public final Function0 a;

   public final void onTransitionReady() {
      MediaEngine.k(this.a);
   }
}
