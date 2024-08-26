package com.discord.chat.presentation.message.view.mosaic_recycler;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;

public final class c implements OnClickListener {
   public final AttachmentMediaMosaicAdapter j;
   public final VideoAttachmentMessageAccessory k;
   public final MessagePartViewHolder l;

   public final void onClick(View var1) {
      AttachmentMediaMosaicAdapter.d(this.j, this.k, this.l, var1);
   }
}
