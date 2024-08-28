package com.discord.recycler_view.decorations

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.q

public class HorizontalSpacingItemDecoration(spacingPx: Int) : ItemDecoration {
   private final val spacingPx: Int

   init {
      this.spacingPx = var1;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      q.h(var1, "outRect");
      q.h(var2, "view");
      q.h(var3, "parent");
      q.h(var4, "state");
      val var6: Adapter = var3.getAdapter();
      q.e(var6);
      if (var3.getChildAdapterPosition(var2) != var6.getItemCount() - 1) {
         var1.right = this.spacingPx;
      }
   }
}
