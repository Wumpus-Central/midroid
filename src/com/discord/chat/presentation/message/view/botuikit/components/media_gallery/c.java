package com.discord.chat.presentation.message.view.botuikit.components.media_gallery;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;

// $VF: synthetic class
public final class c implements OnClickListener {
   public final MediaGalleryDisplayComponentAdapter j;
   public final MediaGalleryDisplayComponent k;
   public final MediaGalleryItem l;
   public final MessagePartViewHolder m;

   public final void onClick(View var1) {
      MediaGalleryDisplayComponentAdapter.b(this.j, this.k, this.l, this.m, var1);
   }
}
