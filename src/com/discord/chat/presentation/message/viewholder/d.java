package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class d implements OnLongClickListener {
   public final Function2 j;
   public final AudioAttachmentMessageAccessory k;

   public final boolean onLongClick(View var1) {
      return AudioPlayerViewHolder.b(this.j, this.k, var1);
   }
}
