package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.OnPingTimeoutCallback;
import kotlin.jvm.functions.Function4;

public final class g implements OnPingTimeoutCallback {
   public final Function4 a;

   public final void onPingTimeout(String var1, int var2, int var3, int var4) {
      MediaEngine.r(this.a, var1, var2, var3, var4);
   }
}
