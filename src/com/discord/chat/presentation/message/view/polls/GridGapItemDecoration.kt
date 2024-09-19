package com.discord.chat.presentation.message.view.polls

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.q

public class GridGapItemDecoration(spanCount: Int, gapPx: Int) : RecyclerView.ItemDecoration {
   private final val gapPx: Int
   private final val spanCount: Int

   init {
      this.spanCount = var1;
      this.gapPx = var2;
   }

   public override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      q.h(var1, "outRect");
      q.h(var2, "view");
      q.h(var3, "parent");
      q.h(var4, "state");
      val var7: Int = var3.getChildAdapterPosition(var2);
      val var6: Int = this.spanCount;
      val var8: Int = var7 % this.spanCount;
      val var5: Int = this.gapPx;
      var1.left = var8 * this.gapPx / this.spanCount;
      var1.right = var5 - (var8 + 1) * var5 / var6;
      if (var7 >= var6) {
         var1.top = var5;
      }
   }
}
