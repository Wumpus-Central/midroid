package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.GetEncryptionModesCallback;
import kotlin.jvm.functions.Function1;

public final class w implements GetEncryptionModesCallback {
   public final Function1 a;

   public final void onEncryptionModes(String[] var1) {
      MediaEngine.m(this.a, var1);
   }
}
