package com.discord.mobile_voice_overlay;

import android.graphics.Rect;
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class d implements Function1 {
   public final OverlayVoiceBubble d;
   public final Rect e;

   public final Object invoke(Object var1) {
      return MobileVoiceOverlay.p(this.d, this.e, (OverlayMenuBubbleDialog)var1);
   }
}
