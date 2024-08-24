package com.discord.chat.messagemanager;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;

// $VF: synthetic class
public final class b implements OnLongClickListener {
   public final MessageViewManagers.MessageBundleViewManager j;
   public final MessageBundleView k;

   public final boolean onLongClick(View var1) {
      return MessageViewManagers.MessageBundleViewManager.a(this.j, this.k, var1);
   }
}
