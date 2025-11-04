package com.discord.mobile_voice_overlay.views

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser

private class VoiceUserViewHolder(overlayVoiceBubble: OverlayVoiceBubble) : ViewHolder(var1) {
   public final val overlayVoiceBubble: OverlayVoiceBubble

   init {
      this.overlayVoiceBubble = var1;
   }

   public fun bind(user: MobileVoiceOverlayDataUser) {
      this.overlayVoiceBubble.configureUI(var1);
   }
}
