package com.discord.chat.presentation.message.view.botuikit.components;

import android.view.View;
import android.view.View.OnClickListener;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener;

public final class k implements OnClickListener {
   public final ComponentActionListener j;
   public final SelectComponent k;

   public final void onClick(View var1) {
      SelectComponentView.b(this.j, this.k, var1);
   }
}
