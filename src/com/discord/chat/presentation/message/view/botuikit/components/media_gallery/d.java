package com.discord.chat.presentation.message.view.botuikit.components.media_gallery;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;

// $VF: synthetic class
public final class d implements OnLongClickListener {
   public final MediaGalleryDisplayComponentAdapter j;
   public final MediaGalleryDisplayComponent k;
   public final MediaGalleryItem l;

   public final boolean onLongClick(View var1) {
      return MediaGalleryDisplayComponentAdapter.d(this.j, this.k, this.l, var1);
   }
}
