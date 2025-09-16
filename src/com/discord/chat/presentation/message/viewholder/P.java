package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class P implements OnClickListener {
   public final Function1 d;
   public final ThreadEmbedMessageAccessory e;

   public final void onClick(View var1) {
      ThreadEmbedViewHolder.b(this.d, this.e, var1);
   }
}
