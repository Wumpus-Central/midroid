package com.discord.mobile_voice_overlay;

import android.view.MotionEvent;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class m implements Function1 {
   public final MobileVoiceOverlay j;
   public final OverlayVoiceBubble k;

   public final Object invoke(Object var1) {
      return MobileVoiceOverlay.i(this.j, this.k, (MotionEvent)var1);
   }
}
