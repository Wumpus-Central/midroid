package com.discord.chat.presentation.message.view.polls;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.attachment.Attachment;
import kotlin.jvm.functions.Function6;

// $VF: synthetic class
public final class g implements OnLongClickListener {
   public final PollMediaView j;
   public final Function6 k;
   public final Attachment l;

   public final boolean onLongClick(View var1) {
      return PollMediaView.b(this.j, this.k, this.l, var1);
   }
}
