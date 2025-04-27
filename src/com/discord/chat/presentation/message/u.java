package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class u implements OnClickListener {
   public final ChatEventHandler j;

   public final void onClick(View var1) {
      MessageView.a(this.j, var1);
   }
}
