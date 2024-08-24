package com.discord.mobile_voice_overlay.views

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser
import kotlin.jvm.internal.r

private class VoiceUserViewHolder(overlayVoiceBubble: OverlayVoiceBubble) : ViewHolder {
   public final val overlayVoiceBubble: OverlayVoiceBubble

   init {
      r.h(var1, "overlayVoiceBubble");
      super(var1);
      this.overlayVoiceBubble = var1;
   }

   public fun bind(user: MobileVoiceOverlayDataUser) {
      r.h(var1, "user");
      this.overlayVoiceBubble.configureUI(var1);
   }
}
