package com.discord.media.engine;

import com.discord.native.engine.AudioInputDeviceDescription;
import com.discord.native.engine.NativeEngine.GetAudioInputDevicesCallback;
import kotlin.jvm.functions.Function1;

public final class k implements GetAudioInputDevicesCallback {
   public final Function1 a;

   public final void onDevices(AudioInputDeviceDescription[] var1) {
      MediaEngine.v(this.a, var1);
   }
}
