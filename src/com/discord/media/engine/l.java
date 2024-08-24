package com.discord.media.engine;

import com.discord.native.engine.NativeEngine;
import com.discord.native.engine.VideoInputDeviceDescription;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class l implements NativeEngine.GetVideoInputDevicesCallback {
   public final Function1 a;

   @Override
   public final void onDevices(VideoInputDeviceDescription[] var1) {
      MediaEngine.h(this.a, var1);
   }
}
