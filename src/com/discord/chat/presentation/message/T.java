package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.events.ChatEventHandler;

// $VF: synthetic class
public final class T implements OnClickListener {
   public final ChatEventHandler d;
   public final String e;
   public final long i;
   public final String m;

   public final void onClick(View var1) {
      MessageTagView.b(this.d, this.e, this.i, this.m, var1);
   }
}
