package com.discord.chat.presentation.message.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

public sealed class MessagePartViewHolder protected constructor(view: View) : RecyclerView.ViewHolder(var1) {
   init {
      var1.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
   }
}
