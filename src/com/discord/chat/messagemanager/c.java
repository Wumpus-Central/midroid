package com.discord.chat.messagemanager;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;

// $VF: synthetic class
public final class c implements OnClickListener {
   public final MessageViewManagers.MessageBundleViewManager j;
   public final MessageBundleView k;

   public final void onClick(View var1) {
      MessageViewManagers.MessageBundleViewManager.d(this.j, this.k, var1);
   }
}
