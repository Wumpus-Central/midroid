package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.functions.Function1;

public final class o0 implements OnClickListener {
   public final Function1 j;
   public final String k;

   public final void onClick(View var1) {
      SafetyPolicyNoticeView.b(this.j, this.k, var1);
   }
}
