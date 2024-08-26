package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.functions.Function1;

public final class g0 implements OnClickListener {
   public final Function1 j;
   public final String k;

   public final void onClick(View var1) {
      GuildInviteDisabledView.b(this.j, this.k, var1);
   }
}
