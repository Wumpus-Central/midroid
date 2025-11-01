package com.discord.chat.presentation.message.view.polls

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State

public class VerticalGapItemDecoration(gapPx: Int) : ItemDecoration {
   private final val gapPx: Int

   init {
      this.gapPx = var1;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      if (var3.getChildAdapterPosition(var2) < var4.b() - 1) {
         var1.bottom = this.gapPx;
      }
   }
}
