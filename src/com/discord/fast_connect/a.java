package com.discord.fast_connect;

import com.facebook.react.modules.websocket.WebSocketModule.OnOpenHandler;
import okhttp3.WebSocket;

// $VF: synthetic class
public final class a implements OnOpenHandler {
   public final FastConnectModule a;

   public final void onOpen(WebSocket var1, int var2) {
      FastConnectModule.a(this.a, var1, var2);
   }
}
