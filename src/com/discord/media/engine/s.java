package com.discord.media.engine;

import com.discord.native.engine.NativeEngine.GetSupportedVideoCodecsCallback;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class s implements GetSupportedVideoCodecsCallback {
   public final Function1 a;

   public final void onSupportedVideoCodecs(String[] var1) {
      MediaEngine.e(this.a, var1);
   }
}
