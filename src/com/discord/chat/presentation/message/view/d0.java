package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.forwarding.ForwardInfo;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class d0 implements OnClickListener {
   public final Function3 j;
   public final ForwardInfo k;
   public final long l;
   public final String m;

   public final void onClick(View var1) {
      ForwardBreadcrumbView.b(this.j, this.k, this.l, this.m, var1);
   }
}
