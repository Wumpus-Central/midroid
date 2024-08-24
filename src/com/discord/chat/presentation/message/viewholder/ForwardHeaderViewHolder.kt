package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.view.ForwardHeaderView

public class ForwardHeaderViewHolder(headerView: ForwardHeaderView) : MessagePartViewHolder {
   private final val headerView: ForwardHeaderView

   init {
      kotlin.jvm.internal.r.h(var1, "headerView");
      super(var1, null);
      this.headerView = var1;
   }

   public fun bind(useOldIcon: Boolean) {
      this.headerView.setIcon(var1);
   }
}
