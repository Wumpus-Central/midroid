package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayDialog;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class o implements Function1 {
   public final OverlayViewProvider j;

   public final Object invoke(Object var1) {
      return MobileVoiceOverlay.m(this.j, (OverlayDialog)var1);
   }
}
