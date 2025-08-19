package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.AppMessageEmbedAccessory
import com.discord.chat.presentation.message.view.AppMessageEmbedView

public class AppMessageEmbedViewHolder(view: AppMessageEmbedView, eventHandler: ChatEventHandler) : MessagePartViewHolder(var1) {
   private final val view: AppMessageEmbedView
   public final val eventHandler: ChatEventHandler

   init {
      this.view = var1;
      this.eventHandler = var2;
   }

   public fun bind(accessory: AppMessageEmbedAccessory) {
      this.view.initView(var1.getAppMessageEmbed(), this.eventHandler, var1.getConstrainedWidth());
   }
}
