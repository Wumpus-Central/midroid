package com.discord.sticker_picker;

import android.view.View;
import android.view.View.OnLongClickListener;

public final class b implements OnLongClickListener {
   public final StickerPickerRowView j;
   public final StickerPickerRow.Sticker k;

   public final boolean onLongClick(View var1) {
      return StickerPickerRowView.b(this.j, this.k, var1);
   }
}
