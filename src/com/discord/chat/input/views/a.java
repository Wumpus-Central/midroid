package com.discord.chat.input.views;

import android.content.Context;
import android.content.ClipData.Item;
import androidx.core.util.g;

public final class a implements g {
   public final Context a;

   public final boolean test(Object var1) {
      return ChatInputRootView.c(this.a, (Item)var1);
   }
}
