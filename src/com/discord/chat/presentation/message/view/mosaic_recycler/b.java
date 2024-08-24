package com.discord.chat.presentation.message.view.mosaic_recycler;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;

// $VF: synthetic class
public final class b implements OnLongClickListener {
   public final AttachmentMediaMosaicAdapter j;
   public final ImageAttachmentMessageAccessory k;

   public final boolean onLongClick(View var1) {
      return AttachmentMediaMosaicAdapter.c(this.j, this.k, var1);
   }
}
