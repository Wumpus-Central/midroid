package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.media_player.MediaSource;
import kotlin.jvm.functions.Function2;

public final class v implements OnClickListener {
   public final Function2 j;
   public final MediaSource k;
   public final boolean l;
   public final EmbedView m;

   public final void onClick(View var1) {
      EmbedView.h(this.j, this.k, this.l, this.m, var1);
   }
}
