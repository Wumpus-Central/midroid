package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class g0 implements OnClickListener {
   public final Function1 d;
   public final EphemeralIndication e;

   public final void onClick(View var1) {
      EphemeralIndicationView.i(this.d, this.e, var1);
   }
}
