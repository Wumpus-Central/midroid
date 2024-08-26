package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory;

public final class m implements OnClickListener {
   public final GuildEventInviteViewHolder j;
   public final GuildEventInviteMessageAccessory k;

   public final void onClick(View var1) {
      GuildEventInviteViewHolder.b(this.j, this.k, var1);
   }
}
