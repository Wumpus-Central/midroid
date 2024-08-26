package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.functions.Function2;

public final class l implements OnClickListener {
   public final Function2 j;
   public final String k;
   public final long l;

   public final void onClick(View var1) {
      FlaggedMessageActionBarViewHolder.a(this.j, this.k, this.l, var1);
   }
}
