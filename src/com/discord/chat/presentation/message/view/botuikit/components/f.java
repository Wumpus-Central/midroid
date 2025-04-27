package com.discord.chat.presentation.message.view.botuikit.components;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;

// $VF: synthetic class
public final class f implements OnLongClickListener {
   public final ComponentContext j;
   public final ThumbnailDisplayComponent k;

   public final boolean onLongClick(View var1) {
      return ThumbnailDisplayComponentView.a(this.j, this.k, var1);
   }
}
