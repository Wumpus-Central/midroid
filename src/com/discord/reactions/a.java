package com.discord.reactions;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements OnClickListener {
   public final Function1 j;
   public final ReactionView.Reaction k;

   public final void onClick(View var1) {
      BurstReactionViewHolder.b(this.j, this.k, var1);
   }
}
