package com.discord.mobile_voice_overlay.views

import androidx.recyclerview.widget.RecyclerView
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser
import kotlin.jvm.internal.q

private class VoiceUserViewHolder(overlayVoiceBubble: OverlayVoiceBubble) : RecyclerView.ViewHolder {
   public final val overlayVoiceBubble: OverlayVoiceBubble

   init {
      q.h(var1, "overlayVoiceBubble");
      super(var1);
      this.overlayVoiceBubble = var1;
   }

   public fun bind(user: MobileVoiceOverlayDataUser) {
      q.h(var1, "user");
      this.overlayVoiceBubble.configureUI(var1);
   }
}
