package com.discord.emoji_picker;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class i implements Function3 {
   public final Function1 j;
   public final EmojiPickerScroller k;
   public final Function2 l;

   public final Object invoke(Object var1, Object var2, Object var3) {
      return EmojiPickerScroller.b(this.j, this.k, this.l, (RecyclerView)var1, (Integer)var2, (Integer)var3);
   }
}
