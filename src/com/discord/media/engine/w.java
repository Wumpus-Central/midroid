package com.discord.media.engine;

import com.discord.native.engine.NativeConnection;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class w implements NativeConnection.GetEncryptionModesCallback {
   public final Function1 a;

   @Override
   public final void onEncryptionModes(String[] var1) {
      MediaEngine.m(this.a, var1);
   }
}
