package com.discord.chat.presentation.message.view.polls

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.r

public class GridGapItemDecoration(spanCount: Int, gapPx: Int) : RecyclerView.ItemDecoration {
   private final val spanCount: Int
   private final val gapPx: Int

   init {
      this.spanCount = var1;
      this.gapPx = var2;
   }

   public override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      r.h(var1, "outRect");
      r.h(var2, "view");
      r.h(var3, "parent");
      r.h(var4, "state");
      val var8: Int = var3.getChildAdapterPosition(var2);
      val var5: Int = this.spanCount;
      val var6: Int = var8 % this.spanCount;
      val var7: Int = this.gapPx;
      var1.left = var6 * this.gapPx / this.spanCount;
      var1.right = var7 - (var6 + 1) * var7 / var5;
      if (var8 >= var5) {
         var1.top = var7;
      }
   }
}
