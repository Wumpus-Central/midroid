package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.functions.Function2;

public final class p0 implements OnClickListener {
   public final Function2 j;
   public final String k;
   public final String l;

   public final void onClick(View var1) {
      SafetySystemNotificationView.b(this.j, this.k, this.l, var1);
   }
}
