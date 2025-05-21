package com.discord.chat.presentation.message.system;

import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.message.view.MessageContentView;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class f implements Function1 {
   public final SystemMessageView j;
   public final Message k;
   public final OnLongClickListener l;

   public final Object invoke(Object var1) {
      return SystemMessageView.g(this.j, this.k, this.l, (MessageContentView)var1);
   }
}
