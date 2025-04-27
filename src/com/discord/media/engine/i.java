package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class i implements NativeEngine.GetCodecCapabilitiesCallback {
   public final Function1 a;

   @Override
   public final void onCodecCapabilities(String var1) {
      MediaEngine.x(this.a, var1);
   }
}
