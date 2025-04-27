package com.discord.chat.input.views;

import android.content.Context;
import android.content.ClipData.Item;
import androidx.core.util.Predicate;

// $VF: synthetic class
public final class c implements Predicate {
   public final Context a;

   @Override
   public final boolean test(Object var1) {
      return ChatInputRootView.b(this.a, (Item)var1);
   }
}
