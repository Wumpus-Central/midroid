package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class s implements OnLongClickListener {
   public final Function1 d;
   public final String e;

   public final boolean onLongClick(View var1) {
      return EmbedView.n(this.d, this.e, var1);
   }
}
