package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.Message;
import kotlin.jvm.functions.Function6;

// $VF: synthetic class
public final class z0 implements OnLongClickListener {
   public final Function6 d;
   public final Message e;
   public final int i;
   public final MediaType t;

   public final boolean onLongClick(View var1) {
      return MessageView.f(this.d, this.e, this.i, this.t, var1);
   }
}
