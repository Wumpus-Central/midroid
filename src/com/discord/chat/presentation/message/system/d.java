package com.discord.chat.presentation.message.system;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class d implements OnClickListener {
   public final ChatEventHandler d;
   public final Message e;

   public final void onClick(View var1) {
      CallSystemMessageView.g(this.d, this.e, var1);
   }
}
