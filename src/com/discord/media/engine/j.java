package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class j implements NativeEngine.MLSSigningKeyCallback {
   public final Function2 a;

   @Override
   public final void onMLSSigningKey(String var1, String var2) {
      MediaEngine.h(this.a, var1, var2);
   }
}
