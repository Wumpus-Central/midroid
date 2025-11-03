package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;

// $VF: synthetic class
public final class b implements OnClickListener {
   public final ChatEventHandler d;
   public final UserId e;
   public final GuildId i;
   public final ChannelId t;
   public final ConnectionsRoleTag u;

   public final void onClick(View var1) {
      ConnectionsRoleTagView.a(this.d, this.e, this.i, this.t, this.u, var1);
   }
}
