package com.discord.emoji_picker;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.functions.Function2;

public final class d implements OnClickListener {
   public final EmojiPickerViewHolder.Emoji j;
   public final Function2 k;

   public final void onClick(View var1) {
      EmojiPickerViewHolder.Emoji.b(this.j, this.k, var1);
   }
}
