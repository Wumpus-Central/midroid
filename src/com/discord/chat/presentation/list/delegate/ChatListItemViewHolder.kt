package com.discord.chat.presentation.list.delegate

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.list.ChatListChildView

public class ChatListItemViewHolder<V extends View>(view: Any) : RecyclerView.ViewHolder(var1) {
   public final val view: Any

   init {
      this.view = (V)var1;
      if (var1 !is ChatListChildView) {
         throw new IllegalArgumentException("Failed requirement.");
      }
   }
}
