package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class A implements NativeConnection.SecureFramesStateUpdateCallback {
   public final Function1 a;

   @Override
   public final void onSecureFramesStateUpdateCallback(String var1) {
      MediaEngine.r(this.a, var1);
   }
}
