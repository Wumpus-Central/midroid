package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.sticker.Sticker;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class L implements OnLongClickListener {
   public final Function1 d;
   public final Sticker e;

   public final boolean onLongClick(View var1) {
      return StickerGifViewHolder.b(this.d, this.e, var1);
   }
}
