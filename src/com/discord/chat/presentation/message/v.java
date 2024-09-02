package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class v implements OnClickListener {
   public final ChatEventHandler j;
   public final String k;
   public final ExecutedCommand l;

   public final void onClick(View var1) {
      MessageViewReplyPreview.h(this.j, this.k, this.l, var1);
   }
}
