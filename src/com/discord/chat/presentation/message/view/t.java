package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.embed.Embed;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class t implements OnClickListener {
   public final Function3 j;
   public final String k;
   public final Embed l;

   public final void onClick(View var1) {
      EmbedView.j(this.j, this.k, this.l, var1);
   }
}
