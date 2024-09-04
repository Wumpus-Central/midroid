package com.discord.media.engine;

import com.discord.native.engine.NativeEngine.StopLocalAudioRecordingCallback;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class h implements StopLocalAudioRecordingCallback {
   public final Function2 a;

   public final void onStopLocalAudioRecording(String var1, int var2) {
      MediaEngine.s(this.a, var1, var2);
   }
}
