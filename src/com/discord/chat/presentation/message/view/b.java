package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class b implements OnClickListener {
   public final AppMessageEmbedView j;
   public final ChatEventHandler k;
   public final AppMessageEmbedImpl l;

   public final void onClick(View var1) {
      AppMessageEmbedView.h(this.j, this.k, this.l, var1);
   }
}
