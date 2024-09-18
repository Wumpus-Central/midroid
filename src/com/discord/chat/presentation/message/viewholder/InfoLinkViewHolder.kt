package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.view.InfoLinkView
import com.discord.react_asset_fetcher.ReactAsset

public class InfoLinkViewHolder(view: InfoLinkView) : MessagePartViewHolder {
   private final val view: InfoLinkView

   init {
      kotlin.jvm.internal.q.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   public fun bind(text: String, icon: ReactAsset, onInfoLinkClicked: () -> Unit) {
      kotlin.jvm.internal.q.h(var1, "text");
      kotlin.jvm.internal.q.h(var2, "icon");
      kotlin.jvm.internal.q.h(var3, "onInfoLinkClicked");
      this.view.configure(var1, var2, var3);
   }
}
