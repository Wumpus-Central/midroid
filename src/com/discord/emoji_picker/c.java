package com.discord.emoji_picker;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import kotlin.jvm.functions.Function2;

public final class c implements OnLayoutChangeListener {
   public final EmojiPickerScroller j;
   public final Function2 k;

   public final void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      EmojiPickerScroller.a(this.j, this.k, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
