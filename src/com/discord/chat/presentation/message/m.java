package com.discord.chat.presentation.message;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.Message;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class m implements OnClickListener {
   public final Function2 j;
   public final Message k;

   public final void onClick(View var1) {
      MessageView.b(this.j, this.k, var1);
   }
}
