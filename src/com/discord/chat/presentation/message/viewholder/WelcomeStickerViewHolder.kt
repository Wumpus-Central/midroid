package com.discord.chat.presentation.message.viewholder

import androidx.recyclerview.widget.RecyclerView.LayoutParams
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory
import com.discord.chat.presentation.stickers.WelcomeStickerView
import com.discord.primitives.MessageId

public class WelcomeStickerViewHolder(welcomeStickerView: WelcomeStickerView, onWelcomeReplyClicked: (Sticker, MessageId) -> Unit) : MessagePartViewHolder(var1) {
   private final val welcomeStickerView: WelcomeStickerView
   private final val onWelcomeReplyClicked: (Sticker, MessageId) -> Unit

   init {
      this.welcomeStickerView = var1;
      this.onWelcomeReplyClicked = var2;
      var1.setLayoutParams(new LayoutParams(-2, -2));
   }

   public fun bind(welcomeStickerAccessory: WelcomeStickerAccessory) {
      this.welcomeStickerView.setSticker(var1.getSticker(), var1.getMessage(), this.onWelcomeReplyClicked);
   }
}
