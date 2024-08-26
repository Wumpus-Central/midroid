package com.discord.media.engine;

import com.discord.native.engine.AudioOutputDeviceDescription;
import com.discord.native.engine.NativeEngine.GetAudioOutputDevicesCallback;
import kotlin.jvm.functions.Function1;

public final class t implements GetAudioOutputDevicesCallback {
   public final Function1 a;

   public final void onDevices(AudioOutputDeviceDescription[] var1) {
      MediaEngine.y(this.a, var1);
   }
}
