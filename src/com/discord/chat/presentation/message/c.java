package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class c implements OnClickListener {
   public final ChatEventHandler j;
   public final String k;
   public final String l;

   public final void onClick(View var1) {
      GameIconView.a(this.j, this.k, this.l, var1);
   }
}
