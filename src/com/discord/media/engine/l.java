package com.discord.media.engine;

import com.discord.native.engine.VideoInputDeviceDescription;
import com.discord.native.engine.NativeEngine.GetVideoInputDevicesCallback;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class l implements GetVideoInputDevicesCallback {
   public final Function1 a;

   public final void onDevices(VideoInputDeviceDescription[] var1) {
      MediaEngine.h(this.a, var1);
   }
}
