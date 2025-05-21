package com.discord.emoji_picker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class u implements Function1 {
   public final Function2 j;
   public final EmojiPickerView k;

   public final Object invoke(Object var1) {
      return EmojiPickerView.T(this.j, this.k, (EmojiPickerScroller.ScrollEvent)var1);
   }
}
