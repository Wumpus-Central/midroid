package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.Message;
import kotlin.jvm.functions.Function6;

// $VF: synthetic class
public final class b0 implements OnLongClickListener {
   public final Function6 d;
   public final Message e;
   public final int i;
   public final MediaType m;

   public final boolean onLongClick(View var1) {
      return MessageView.e(this.d, this.e, this.i, this.m, var1);
   }
}
