package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class q implements OnLongClickListener {
   public final Function1 j;
   public final EmbedView k;

   public final boolean onLongClick(View var1) {
      return EmbedView.b(this.j, this.k, var1);
   }
}
