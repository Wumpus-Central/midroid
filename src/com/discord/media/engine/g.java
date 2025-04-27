package com.discord.media.engine;

import com.discord.native.engine.ConnectionInfo;
import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class g implements NativeEngine.ConnectToServerCallback {
   public final Function2 a;

   @Override
   public final void onConnectToServer(ConnectionInfo var1, String var2) {
      MediaEngine.t(this.a, var1, var2);
   }
}
