package com.discord.chat.presentation.list.delegate;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem;

public final class b implements OnClickListener {
   public final SummarySeparatorDelegate j;
   public final SummarySeparatorChatListItem k;

   public final void onClick(View var1) {
      SummarySeparatorDelegate.a(this.j, this.k, var1);
   }
}
