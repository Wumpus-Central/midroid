package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.Message;
import kotlin.jvm.functions.Function6;

// $VF: synthetic class
public final class j0 implements OnLongClickListener {
   public final Function6 d;
   public final Message e;

   public final boolean onLongClick(View var1) {
      return MessageView.g(this.d, this.e, var1);
   }
}
