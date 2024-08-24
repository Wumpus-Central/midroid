package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class f implements NativeEngine.StartLocalAudioRecordingCallback {
   public final Function1 a;

   @Override
   public final void onStartLocalAudioRecording(boolean var1) {
      MediaEngine.w(this.a, var1);
   }
}
