package com.discord.chat.presentation.message.system;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class b implements OnClickListener {
   public final ChatEventHandler j;
   public final Message k;

   public final void onClick(View var1) {
      CallSystemMessageView.g(this.j, this.k, var1);
   }
}
