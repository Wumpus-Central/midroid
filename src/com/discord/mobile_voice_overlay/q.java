package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.primitives.ChannelId;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class q implements Function1 {
   public final OverlayVoiceSelectorBubbleDialog d;

   public final Object invoke(Object var1) {
      return MobileVoiceOverlay.d(this.d, (ChannelId)var1);
   }
}
