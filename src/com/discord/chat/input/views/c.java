package com.discord.chat.input.views;

import android.view.View;
import android.view.View.OnFocusChangeListener;

public final class c implements OnFocusChangeListener {
   public final ChatInputRootView a;

   public final void onFocusChange(View var1, boolean var2) {
      ChatInputRootView.a(this.a, var1, var2);
   }
}
