package com.discord.media.engine;

import com.discord.native.engine.NativeEngine.MLSSigningKeyCallback;
import kotlin.jvm.functions.Function2;

public final class i implements MLSSigningKeyCallback {
   public final Function2 a;

   public final void onMLSSigningKey(String var1, String var2) {
      MediaEngine.f(this.a, var1, var2);
   }
}
