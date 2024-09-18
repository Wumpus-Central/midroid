package com.discord.media.engine;

import com.discord.native.engine.AudioInputDeviceDescription;
import com.discord.native.engine.NativeEngine;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class m implements NativeEngine.GetAudioInputDevicesCallback {
   public final Function1 a;

   @Override
   public final void onDevices(AudioInputDeviceDescription[] var1) {
      MediaEngine.w(this.a, var1);
   }
}
