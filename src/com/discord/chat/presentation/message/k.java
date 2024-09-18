package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class k implements OnClickListener {
   public final ChatEventHandler j;
   public final String k;
   public final long l;
   public final String m;

   public final void onClick(View var1) {
      MessageAltRemixTagView.a(this.j, this.k, this.l, this.m, var1);
   }
}
