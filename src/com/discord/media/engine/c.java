package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.OnPingCallback;
import kotlin.jvm.functions.Function4;

public final class c implements OnPingCallback {
   public final Function4 a;

   public final void onPing(int var1, String var2, int var3, int var4) {
      MediaEngine.x(this.a, var1, var2, var3, var4);
   }
}
