package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import kotlin.jvm.functions.Function3;

public final class i implements OnClickListener {
   public final Function3 j;
   public final ChannelPromptActionsAccessory k;

   public final void onClick(View var1) {
      ChannelPromptActionsViewHolder.a(this.j, this.k, var1);
   }
}
