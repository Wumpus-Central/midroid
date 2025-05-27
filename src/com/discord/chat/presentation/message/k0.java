package com.discord.chat.presentation.message;

import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.message.view.MessageContentView;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class k0 implements Function1 {
   public final MessageView j;
   public final Message k;
   public final OnClickListener l;
   public final OnLongClickListener m;

   public final Object invoke(Object var1) {
      return MessageView.p(this.j, this.k, this.l, this.m, (MessageContentView)var1);
   }
}
