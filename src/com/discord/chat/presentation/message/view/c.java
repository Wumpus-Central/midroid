package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class c implements OnClickListener {
   public final AppMessageEmbedView d;
   public final ChatEventHandler e;
   public final AppMessageEmbedImpl i;

   public final void onClick(View var1) {
      AppMessageEmbedView.h(this.d, this.e, this.i, var1);
   }
}
