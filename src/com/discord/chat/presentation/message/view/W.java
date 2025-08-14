package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class W implements OnClickListener {
   public final Message d;
   public final ChatEventHandler e;

   public final void onClick(View var1) {
      FlaggedMessageEmbedView.l(this.d, this.e, var1);
   }
}
