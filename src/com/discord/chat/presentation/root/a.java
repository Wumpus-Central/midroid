package com.discord.chat.presentation.root;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

public final class a implements OnLayoutChangeListener {
   public final View j;
   public final ChatView k;

   public final void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ChatView.b(this.j, this.k, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
