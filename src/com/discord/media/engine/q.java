package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.SecureFramesStateUpdateCallback;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class q implements SecureFramesStateUpdateCallback {
   public final Function1 a;

   public final void onSecureFramesStateUpdateCallback(String var1) {
      MediaEngine.a(this.a, var1);
   }
}
