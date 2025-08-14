package com.discord.mobile_voice_overlay;

import android.view.MotionEvent;
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class k implements Function1 {
   public final OverlayVoiceBubble d;
   public final MotionEvent e;
   public final MobileVoiceOverlay i;

   public final Object invoke(Object var1) {
      return MobileVoiceOverlay.a(this.d, this.e, this.i, (OverlayTrashWrap)var1);
   }
}
