package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.sticker.Sticker;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class v implements OnLongClickListener {
   public final Function1 j;
   public final Sticker k;

   public final boolean onLongClick(View var1) {
      return StickerLottieViewHolder.a(this.j, this.k, var1);
   }
}
