package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class t implements OnClickListener {
   public final ChatEventHandler j;
   public final String k;
   public final int l;

   public final void onClick(View var1) {
      GuildProfileInviteViewHolder.b(this.j, this.k, this.l, var1);
   }
}
