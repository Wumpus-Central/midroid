package com.discord.chat.presentation.message.view.polls

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State

public class GridGapItemDecoration(spanCount: Int, gapPx: Int) : ItemDecoration {
   private final val spanCount: Int
   private final val gapPx: Int

   init {
      this.spanCount = var1;
      this.gapPx = var2;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      val var7: Int = var3.getChildAdapterPosition(var2);
      val var8: Int = this.spanCount;
      val var5: Int = var7 % this.spanCount;
      val var6: Int = this.gapPx;
      var1.left = var5 * this.gapPx / this.spanCount;
      var1.right = var6 - (var5 + 1) * var6 / var8;
      if (var7 >= var8) {
         var1.top = var6;
      }
   }
}
