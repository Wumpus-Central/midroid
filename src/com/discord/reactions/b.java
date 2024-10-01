package com.discord.reactions;

import android.view.View;
import android.view.View.OnLongClickListener;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class b implements OnLongClickListener {
   public final Function1 j;
   public final ReactionView.Reaction k;

   public final boolean onLongClick(View var1) {
      return ReactionViewHolder.b(this.j, this.k, var1);
   }
}
