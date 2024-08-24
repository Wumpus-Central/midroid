package com.discord.media.engine;

import com.discord.native.engine.AudioOutputDeviceDescription;
import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class t implements NativeEngine.GetAudioOutputDevicesCallback {
   public final Function1 a;

   @Override
   public final void onDevices(AudioOutputDeviceDescription[] var1) {
      MediaEngine.y(this.a, var1);
   }
}
