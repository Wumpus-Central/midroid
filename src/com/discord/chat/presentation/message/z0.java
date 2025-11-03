package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class z0 implements OnLongClickListener {
   public final Message d;
   public final ChatEventHandler e;

   public final boolean onLongClick(View var1) {
      return MessageView.t(this.d, this.e, var1);
   }
}
