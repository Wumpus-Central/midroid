package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class w implements OnLongClickListener {
   public final Function1 j;
   public final CharSequence k;

   public final boolean onLongClick(View var1) {
      return EmbedView.c(this.j, this.k, var1);
   }
}
