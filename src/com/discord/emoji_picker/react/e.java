package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerScroller;
import com.discord.emoji_picker.EmojiPickerView;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class e implements Function2 {
   public final EmojiPickerViewManager j;

   public final Object invoke(Object var1, Object var2) {
      return EmojiPickerViewManager.b(this.j, (EmojiPickerView)var1, (EmojiPickerScroller.ScrollEvent)var2);
   }
}
