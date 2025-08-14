package com.discord.chat.presentation.message.view.polls;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.bridge.attachment.Attachment;
import kotlin.jvm.functions.Function6;

// $VF: synthetic class
public final class n implements OnLongClickListener {
   public final PollMediaView d;
   public final Function6 e;
   public final Attachment i;

   public final boolean onLongClick(View var1) {
      return PollMediaView.b(this.d, this.e, this.i, var1);
   }
}
