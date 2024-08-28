package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class x implements OnClickListener {
   public final Function1 j;
   public final EphemeralIndication k;

   public final void onClick(View var1) {
      EphemeralIndicationView.g(this.j, this.k, var1);
   }
}
