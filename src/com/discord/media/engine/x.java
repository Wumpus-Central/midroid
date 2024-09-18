package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class x implements NativeConnection.OnSpeakingCallback {
   public final Function2 a;

   @Override
   public final void onSpeaking(String var1, int var2) {
      MediaEngine.r(this.a, var1, var2);
   }
}
