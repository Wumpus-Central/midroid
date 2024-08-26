package com.discord.chat.presentation.list.delegate;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.presentation.list.item.CallSystemMessageItem;

public final class a implements OnClickListener {
   public final CallSystemMessageDelegate j;
   public final CallSystemMessageItem k;

   public final void onClick(View var1) {
      CallSystemMessageDelegate.a(this.j, this.k, var1);
   }
}
