package com.discord.reactions;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class c implements OnLongClickListener {
   public final Function1 d;
   public final ReactionView.Reaction e;

   public final boolean onLongClick(View var1) {
      return ReactionViewHolder.c(this.d, this.e, var1);
   }
}
