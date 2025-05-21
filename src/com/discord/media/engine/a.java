package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements NativeConnection.GetEncryptionModesCallback {
   public final Function1 a;

   @Override
   public final void onEncryptionModes(String[] var1) {
      MediaEngine.c(this.a, var1);
   }
}
