package com.discord.media.engine;

import com.discord.native.engine.NativeEngine.StartLocalAudioRecordingCallback;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class f implements StartLocalAudioRecordingCallback {
   public final Function1 a;

   public final void onStartLocalAudioRecording(boolean var1) {
      MediaEngine.w(this.a, var1);
   }
}
