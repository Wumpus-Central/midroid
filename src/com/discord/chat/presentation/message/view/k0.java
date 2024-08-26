package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.media_player.MediaSource;

public final class k0 implements OnClickListener {
   public final MediaView j;
   public final MediaSource k;

   public final void onClick(View var1) {
      MediaView.b(this.j, this.k, var1);
   }
}
