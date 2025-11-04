package com.discord.chat.presentation.message.view.botuikit.components;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;

// $VF: synthetic class
public final class n implements OnLongClickListener {
   public final ComponentContext d;
   public final ThumbnailDisplayComponent e;

   public final boolean onLongClick(View var1) {
      return ThumbnailDisplayComponentView.a(this.d, this.e, var1);
   }
}
