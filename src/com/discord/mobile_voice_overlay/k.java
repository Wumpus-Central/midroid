package com.discord.mobile_voice_overlay;

import android.view.MotionEvent;
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class k implements Function1 {
   public final OverlayVoiceBubble j;
   public final MotionEvent k;
   public final MobileVoiceOverlay l;

   public final Object invoke(Object var1) {
      return MobileVoiceOverlay.a(this.j, this.k, this.l, (OverlayTrashWrap)var1);
   }
}
