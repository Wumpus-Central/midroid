package com.discord.chat.input.views;

import android.content.Context;
import android.content.ClipData.Item;
import androidx.core.util.Predicate;

// $VF: synthetic class
public final class f implements Predicate {
   public final Context a;

   @Override
   public final boolean test(Object var1) {
      return ChatInputRootView.e(this.a, (Item)var1);
   }
}
