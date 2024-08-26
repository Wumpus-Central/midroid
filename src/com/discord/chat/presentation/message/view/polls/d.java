package com.discord.chat.presentation.message.view.polls;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.polls.PollAction;
import kotlin.jvm.functions.Function3;

public final class d implements OnClickListener {
   public final PollAction j;
   public final Function3 k;
   public final long l;
   public final String m;

   public final void onClick(View var1) {
      PollActionButton.b(this.j, this.k, this.l, this.m, var1);
   }
}
