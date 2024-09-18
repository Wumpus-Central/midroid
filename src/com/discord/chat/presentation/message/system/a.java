package com.discord.chat.presentation.message.system;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class a implements OnClickListener {
   public final ChatEventHandler j;
   public final AutoModerationContext k;

   public final void onClick(View var1) {
      AutomodSystemMessageView.g(this.j, this.k, var1);
   }
}
