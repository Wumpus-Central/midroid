package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

public final class p implements OnClickListener {
   public final Message j;
   public final ChatEventHandler k;

   public final void onClick(View var1) {
      MessageView.c(this.j, this.k, var1);
   }
}
