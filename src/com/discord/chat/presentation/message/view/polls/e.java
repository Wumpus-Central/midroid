package com.discord.chat.presentation.message.view.polls;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.polls.PollAction;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class e implements OnClickListener {
   public final PollAction d;
   public final Function3 e;
   public final long i;
   public final String s;

   public final void onClick(View var1) {
      PollActionButton.b(this.d, this.e, this.i, this.s, var1);
   }
}
