package com.discord.chat.presentation.message.system;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class c implements OnLongClickListener {
   public final Message j;
   public final ChatEventHandler k;

   public final boolean onLongClick(View var1) {
      return SystemMessageView.g(this.j, this.k, var1);
   }
}
