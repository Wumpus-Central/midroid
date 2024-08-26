package com.discord.media.engine;

import com.discord.native.engine.ConnectionInfo;
import com.discord.native.engine.NativeEngine.ConnectToServerCallback;
import kotlin.jvm.functions.Function2;

public final class d implements ConnectToServerCallback {
   public final Function2 a;

   public final void onConnectToServer(ConnectionInfo var1, String var2) {
      MediaEngine.o(this.a, var1, var2);
   }
}
