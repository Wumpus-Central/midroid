package com.discord.chat.presentation.message.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.ViewHolder

public sealed class MessagePartViewHolder protected constructor(view: View) : ViewHolder(var1) {
   init {
      var1.setLayoutParams(new LayoutParams(-1, -2));
   }
}
