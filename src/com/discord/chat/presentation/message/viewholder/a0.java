package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed;
import kotlin.jvm.functions.Function3;

public final class a0 implements OnClickListener {
   public final Function3 j;
   public final VoiceInviteEmbed k;

   public final void onClick(View var1) {
      VoiceInviteEmbedViewHolder.a(this.j, this.k, var1);
   }
}
