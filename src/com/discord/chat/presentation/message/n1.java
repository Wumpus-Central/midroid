package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class n1 implements OnClickListener {
   public final ChatEventHandler d;
   public final String e;
   public final ExecutedCommand i;

   public final void onClick(View var1) {
      MessageViewReplyPreview.m(this.d, this.e, this.i, var1);
   }
}
