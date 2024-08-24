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
   public final ChatEventHandler j;
   public final UserId k;
   public final GuildId l;
   public final ChannelId m;
   public final ConnectionsRoleTag n;

   public final void onClick(View var1) {
      ConnectionsRoleTagView.a(this.j, this.k, this.l, this.m, this.n, var1);
   }
}
