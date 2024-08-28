package com.discord.chat.presentation.message.viewholder

import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory
import com.discord.fonts.DiscordFontUtilsKt

public class TimestampViewHolder(timestampView: TextView) : MessagePartViewHolder {
   private final val timestampView: TextView

   init {
      kotlin.jvm.internal.q.h(var1, "timestampView");
      super(var1, null);
      this.timestampView = var1;
   }

   public fun bind(timestampItem: TimestampMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "timestampItem");
      this.timestampView.setText(var1.getTimestamp());
      SetTextSizeSpKt.setTextSizeSp(this.timestampView, 12.0F);
      this.timestampView.setTextColor(var1.getTextColor());
      DiscordFontUtilsKt.setDiscordFont(this.timestampView, var1.getDiscordFont());
   }
}
