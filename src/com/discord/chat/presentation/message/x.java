package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.emoji.RenderableEmoji;

// $VF: synthetic class
public final class x implements OnClickListener {
   public final ChatEventHandler j;
   public final RoleIcon k;
   public final RenderableEmoji l;

   public final void onClick(View var1) {
      RoleIconView.a(this.j, this.k, this.l, var1);
   }
}
