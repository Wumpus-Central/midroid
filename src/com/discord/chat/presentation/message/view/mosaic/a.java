package com.discord.chat.presentation.message.view.mosaic;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;

// $VF: synthetic class
public final class a implements OnClickListener {
   public final MediaMosaicView j;
   public final MosaicMediaItem k;
   public final MessagePartViewHolder l;

   public final void onClick(View var1) {
      MediaMosaicView.c(this.j, this.k, this.l, var1);
   }
}
