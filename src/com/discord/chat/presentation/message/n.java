package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.Message;
import kotlin.jvm.functions.Function6;

// $VF: synthetic class
public final class n implements OnLongClickListener {
   public final Function6 j;
   public final Message k;

   public final boolean onLongClick(View var1) {
      return MessageView.a(this.j, this.k, var1);
   }
}
