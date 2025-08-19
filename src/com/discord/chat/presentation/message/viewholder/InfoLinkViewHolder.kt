package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.view.InfoLinkView
import com.discord.react_asset_fetcher.ReactAsset

public class InfoLinkViewHolder(view: InfoLinkView) : MessagePartViewHolder(var1) {
   private final val view: InfoLinkView

   init {
      this.view = var1;
   }

   public fun bind(text: String, icon: ReactAsset, onInfoLinkClicked: () -> Unit) {
      this.view.configure(var1, var2, var3);
   }
}
