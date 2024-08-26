package com.discord.chat.presentation.message.view.botuikit.components;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.botuikit.ContentInventoryEntry;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;

public final class h implements OnClickListener {
   public final ContentInventoryEntry j;
   public final ComponentContext k;

   public final void onClick(View var1) {
      ContentInventoryComponentView.g(this.j, this.k, var1);
   }
}
