package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function4;

// $VF: synthetic class
public final class z implements NativeConnection.OnVideoCallback {
   public final Function4 a;

   @Override
   public final void onVideo(String var1, long var2, String var4, String var5) {
      MediaEngine.l(this.a, var1, var2, var4, var5);
   }
}
