package com.discord.chat.presentation.message.view.mosaic_recycler;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;

public final class d implements OnLongClickListener {
   public final AttachmentMediaMosaicAdapter j;
   public final VideoAttachmentMessageAccessory k;

   public final boolean onLongClick(View var1) {
      return AttachmentMediaMosaicAdapter.a(this.j, this.k, var1);
   }
}
