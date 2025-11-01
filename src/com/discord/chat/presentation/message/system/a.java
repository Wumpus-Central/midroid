package com.discord.chat.presentation.message.system;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class a implements OnClickListener {
   public final ChatEventHandler d;
   public final AutoModerationContext e;

   public final void onClick(View var1) {
      AutomodSystemMessageView.h(this.d, this.e, var1);
   }
}
