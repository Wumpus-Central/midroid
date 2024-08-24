package com.discord.recycler_view.decorations

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.r

public class HorizontalSpacingItemDecoration(spacingPx: Int) : ItemDecoration {
   private final val spacingPx: Int

   init {
      this.spacingPx = var1;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      r.h(var1, "outRect");
      r.h(var2, "view");
      r.h(var3, "parent");
      r.h(var4, "state");
      val var7: Adapter = var3.getAdapter();
      r.e(var7);
      val var6: Int = var7.getItemCount();
      var var5: Boolean = true;
      if (var3.getChildAdapterPosition(var2) != var6 - 1) {
         var5 = false;
      }

      if (!var5) {
         var1.right = this.spacingPx;
      }
   }
}
