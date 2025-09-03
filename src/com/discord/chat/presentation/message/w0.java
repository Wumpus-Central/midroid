package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.emoji.RenderableEmoji;

// $VF: synthetic class
public final class w0 implements OnClickListener {
   public final ChatEventHandler d;
   public final RoleIcon e;
   public final RenderableEmoji i;

   public final void onClick(View var1) {
      RoleIconView.a(this.d, this.e, this.i, var1);
   }
}
