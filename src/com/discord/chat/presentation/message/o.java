package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.events.ChatEventHandler;

public final class o implements OnClickListener {
   public final ChatEventHandler j;

   public final void onClick(View var1) {
      MessageView.h(this.j, var1);
   }
}
