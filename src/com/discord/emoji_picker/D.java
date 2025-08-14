package com.discord.emoji_picker;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class D implements OnLongClickListener {
   public final EmojiPickerViewHolder.Emoji d;
   public final Function2 e;

   public final boolean onLongClick(View var1) {
      return EmojiPickerViewHolder.Emoji.d(this.d, this.e, var1);
   }
}
