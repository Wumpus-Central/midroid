package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class y implements OnClickListener {
   public final Function1 j;
   public final ThreadEmbedMessageAccessory k;

   public final void onClick(View var1) {
      ThreadEmbedViewHolder.a(this.j, this.k, var1);
   }
}
