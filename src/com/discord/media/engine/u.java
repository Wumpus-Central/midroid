package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class u implements NativeEngine.GetSupportedVideoCodecsCallback {
   public final Function1 a;

   @Override
   public final void onSupportedVideoCodecs(String[] var1) {
      MediaEngine.e(this.a, var1);
   }
}
