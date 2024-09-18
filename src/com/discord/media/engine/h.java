package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class h implements NativeEngine.StopLocalAudioRecordingCallback {
   public final Function2 a;

   @Override
   public final void onStopLocalAudioRecording(String var1, int var2) {
      MediaEngine.s(this.a, var1, var2);
   }
}
