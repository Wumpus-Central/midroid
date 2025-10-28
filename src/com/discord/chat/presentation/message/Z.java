package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class Z implements OnClickListener {
   public final Message d;
   public final ChatEventHandler e;

   public final void onClick(View var1) {
      MessageView.r(this.d, this.e, var1);
   }
}
