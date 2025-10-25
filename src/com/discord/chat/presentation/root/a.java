package com.discord.chat.presentation.root;

import android.view.View;
import kotlin.Pair;

// $VF: synthetic class
public final class a implements Runnable {
   public final View d;
   public final ChatView e;
   public final Pair i;

   @Override
   public final void run() {
      ChatView.c(this.d, this.e, this.i);
   }
}
