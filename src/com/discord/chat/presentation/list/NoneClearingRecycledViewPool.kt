package com.discord.chat.presentation.list

import androidx.recyclerview.widget.RecyclerView.RecycledViewPool

public open class NoneClearingRecycledViewPool : RecycledViewPool {
   public open fun clear() {
   }

   public fun forceClear() {
      super.clear();
   }
}
