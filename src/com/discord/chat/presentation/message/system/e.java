package com.discord.chat.presentation.message.system;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class e implements OnLongClickListener {
   public final Message d;
   public final ChatEventHandler e;

   public final boolean onLongClick(View var1) {
      return SystemMessageView.i(this.d, this.e, var1);
   }
}
