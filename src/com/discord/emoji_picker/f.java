package com.discord.emoji_picker;

import android.view.View;
import android.view.View.OnLongClickListener;

// $VF: synthetic class
public final class f implements OnLongClickListener {
   public final EmojiPickerRowView d;
   public final EmojiPickerRow.Emoji e;

   public final boolean onLongClick(View var1) {
      return EmojiPickerRowView.d(this.d, this.e, var1);
   }
}
