package com.discord.mobile_voice_overlay;

import android.view.MotionEvent;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class m implements Function1 {
   public final MobileVoiceOverlay d;
   public final OverlayVoiceBubble e;

   public final Object invoke(Object var1) {
      return MobileVoiceOverlay.i(this.d, this.e, (MotionEvent)var1);
   }
}
