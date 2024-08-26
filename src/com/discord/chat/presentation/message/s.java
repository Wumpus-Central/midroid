package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.Message;
import kotlin.jvm.functions.Function6;

public final class s implements OnLongClickListener {
   public final Function6 j;
   public final Message k;
   public final int l;
   public final MediaType m;

   public final boolean onLongClick(View var1) {
      return MessageView.d(this.j, this.k, this.l, this.m, var1);
   }
}
