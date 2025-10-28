package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class b implements OnLongClickListener {
   public final Function2 d;
   public final AudioAttachmentMessageAccessory e;

   public final boolean onLongClick(View var1) {
      return AudioPlayerViewHolder.b(this.d, this.e, var1);
   }
}
