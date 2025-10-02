package com.discord.chat.presentation.list

import androidx.recyclerview.widget.RecyclerView

public open class NoneClearingRecycledViewPool : RecyclerView.RecycledViewPool {
   public override fun clear() {
   }

   public fun forceClear() {
      super.clear();
   }
}
