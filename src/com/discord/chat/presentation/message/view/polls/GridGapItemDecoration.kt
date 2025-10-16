package com.discord.chat.presentation.message.view.polls

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State

public class GridGapItemDecoration(spanCount: Int, gapPx: Int) : RecyclerView.ItemDecoration {
   private final val spanCount: Int
   private final val gapPx: Int

   init {
      this.spanCount = var1;
      this.gapPx = var2;
   }

   public override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      val var5: Int = var3.getChildAdapterPosition(var2);
      val var6: Int = this.spanCount;
      val var8: Int = var5 % this.spanCount;
      val var7: Int = this.gapPx;
      var1.left = var8 * this.gapPx / this.spanCount;
      var1.right = var7 - (var8 + 1) * var7 / var6;
      if (var5 >= var6) {
         var1.top = var7;
      }
   }
}
