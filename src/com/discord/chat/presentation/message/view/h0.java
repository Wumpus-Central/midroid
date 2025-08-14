package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.forwarding.ForwardInfo;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class h0 implements OnClickListener {
   public final Function3 d;
   public final ForwardInfo e;
   public final long i;
   public final String m;

   public final void onClick(View var1) {
      ForwardBreadcrumbView.g(this.d, this.e, this.i, this.m, var1);
   }
}
