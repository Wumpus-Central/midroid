package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.OnSpeakingCallback;
import kotlin.jvm.functions.Function2;

public final class v implements OnSpeakingCallback {
   public final Function2 a;

   public final void onSpeaking(String var1, int var2) {
      MediaEngine.q(this.a, var1, var2);
   }
}
