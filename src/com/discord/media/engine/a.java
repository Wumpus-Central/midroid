package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.MLSFailureCallback;
import kotlin.jvm.functions.Function2;

public final class a implements MLSFailureCallback {
   public final Function2 a;

   public final void onMLSFailureCallback(String var1, String var2) {
      MediaEngine.j(this.a, var1, var2);
   }
}
