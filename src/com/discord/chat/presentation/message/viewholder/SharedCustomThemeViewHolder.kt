package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.SharedCustomThemeMessageAccessory
import com.discord.chat.presentation.message.view.customthemes.SharedCustomThemeView
import com.discord.primitives.MessageId

public class SharedCustomThemeViewHolder(sharedCustomThemeView: SharedCustomThemeView) : MessagePartViewHolder(var1) {
   private final val sharedCustomThemeView: SharedCustomThemeView

   init {
      this.sharedCustomThemeView = var1;
   }

   public fun bind(accessory: SharedCustomThemeMessageAccessory, onTapPreview: (MessageId) -> Unit, onViewed: (MessageId) -> Unit) {
      this.sharedCustomThemeView.bind-pPZZVto(var1.getMessageId-3Eiw7ao(), var1.getData(), var1.getAuthor(), var2, var3);
   }
}
