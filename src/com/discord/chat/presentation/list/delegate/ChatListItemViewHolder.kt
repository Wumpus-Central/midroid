package com.discord.chat.presentation.list.delegate

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.presentation.list.ChatListChildView
import kotlin.jvm.internal.r

public class ChatListItemViewHolder<V extends View>(view: Any) : ViewHolder {
   public final val view: Any

   init {
      r.h(var1, "view");
      super(var1);
      this.view = (V)var1;
      if (var1 !is ChatListChildView) {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }
}
