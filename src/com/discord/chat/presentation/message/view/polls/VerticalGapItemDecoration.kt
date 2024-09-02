package com.discord.chat.presentation.message.view.polls

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.q

public class VerticalGapItemDecoration(gapPx: Int) : RecyclerView.ItemDecoration {
   private final val gapPx: Int

   init {
      this.gapPx = var1;
   }

   public override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      q.h(var1, "outRect");
      q.h(var2, "view");
      q.h(var3, "parent");
      q.h(var4, "state");
      if (var3.getChildAdapterPosition(var2) < var4.b() - 1) {
         var1.bottom = this.gapPx;
      }
   }
}
