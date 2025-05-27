package com.discord.emoji_picker;

import android.view.View;
import android.view.View.OnLongClickListener;

// $VF: synthetic class
public final class f implements OnLongClickListener {
   public final EmojiPickerRowView j;
   public final EmojiPickerRow.Emoji k;

   public final boolean onLongClick(View var1) {
      return EmojiPickerRowView.d(this.j, this.k, var1);
   }
}
