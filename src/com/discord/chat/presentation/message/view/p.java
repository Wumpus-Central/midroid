package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function1;

public final class p implements OnLongClickListener {
   public final Function1 j;
   public final String k;

   public final boolean onLongClick(View var1) {
      return EmbedView.a(this.j, this.k, var1);
   }
}
