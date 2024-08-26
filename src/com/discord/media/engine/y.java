package com.discord.media.engine;

import com.discord.native.engine.NativeEngine.GetCodecCapabilitiesCallback;
import kotlin.jvm.functions.Function1;

public final class y implements GetCodecCapabilitiesCallback {
   public final Function1 a;

   public final void onCodecCapabilities(String var1) {
      MediaEngine.b(this.a, var1);
   }
}
