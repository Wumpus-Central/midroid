package com.discord.chat.presentation.message.view.voicemessages;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

public final class i implements OnLayoutChangeListener {
   public final AudioPlayerView j;

   public final void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      AudioPlayerView.a(this.j, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
