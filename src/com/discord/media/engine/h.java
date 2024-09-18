package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function4;

// $VF: synthetic class
public final class h implements NativeConnection.OnPingTimeoutCallback {
   public final Function4 a;

   @Override
   public final void onPingTimeout(String var1, int var2, int var3, int var4) {
      MediaEngine.s(this.a, var1, var2, var3, var4);
   }
}
