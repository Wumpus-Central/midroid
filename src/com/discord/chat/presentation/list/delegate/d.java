package com.discord.chat.presentation.list.delegate;

import com.discord.chat.presentation.list.ChatListFrameLayout;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;

// $VF: synthetic class
public final class d implements Runnable {
   public final ChatListFrameLayout j;
   public final PortalViewChatListItem k;

   @Override
   public final void run() {
      PortalViewDelegate.b(this.j, this.k);
   }
}
