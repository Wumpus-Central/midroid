package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.activities.ActivityInstanceEmbed;
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory;

public final class b implements OnClickListener {
   public final ActivityInstanceEmbed j;
   public final ActivityInstanceEmbedViewHolder k;
   public final ActivityInstanceEmbedMessageAccessory l;

   public final void onClick(View var1) {
      ActivityInstanceEmbedViewHolder.a(this.j, this.k, this.l, var1);
   }
}
