package com.discord.chat.presentation.message.view.polls

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.r

public class GridGapItemDecoration(spanCount: Int, gapPx: Int) : ItemDecoration {
   private final val gapPx: Int
   private final val spanCount: Int

   init {
      this.spanCount = var1;
      this.gapPx = var2;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      r.h(var1, "outRect");
      r.h(var2, "view");
      r.h(var3, "parent");
      r.h(var4, "state");
      val var6: Int = var3.getChildAdapterPosition(var2);
      val var7: Int = this.spanCount;
      val var5: Int = var6 % this.spanCount;
      val var8: Int = this.gapPx;
      var1.left = var5 * this.gapPx / this.spanCount;
      var1.right = var8 - (var5 + 1) * var8 / var7;
      if (var6 >= var7) {
         var1.top = var8;
      }
   }
}
