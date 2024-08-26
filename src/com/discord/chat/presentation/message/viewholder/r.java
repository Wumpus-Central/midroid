package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.sticker.Sticker;
import kotlin.jvm.functions.Function1;

public final class r implements OnClickListener {
   public final Function1 j;
   public final Sticker k;

   public final void onClick(View var1) {
      StickerApngViewHolder.a(this.j, this.k, var1);
   }
}
