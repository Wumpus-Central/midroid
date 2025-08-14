package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class E implements OnLongClickListener {
   public final Function1 d;
   public final CharSequence e;

   public final boolean onLongClick(View var1) {
      return EmbedView.b(this.d, this.e, var1);
   }
}
