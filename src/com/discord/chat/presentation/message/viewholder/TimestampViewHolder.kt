package com.discord.chat.presentation.message.viewholder

import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory
import com.discord.fonts.DiscordFontUtilsKt

public class TimestampViewHolder(timestampView: TextView) : MessagePartViewHolder(var1) {
   private final val timestampView: TextView

   init {
      this.timestampView = var1;
   }

   public fun bind(timestampItem: TimestampMessageAccessory) {
      this.timestampView.setText(var1.getTimestamp());
      SetTextSizeSpKt.setTextSizeSp(this.timestampView, 12.0F);
      this.timestampView.setTextColor(var1.getTextColor());
      DiscordFontUtilsKt.setDiscordFont(this.timestampView, var1.getDiscordFont());
   }
}
