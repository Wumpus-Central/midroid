package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class Z implements OnClickListener {
   public final ChatEventHandler j;

   public final void onClick(View var1) {
      MessageTagView.a(this.j, var1);
   }
}
